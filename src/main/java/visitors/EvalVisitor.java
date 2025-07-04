package visitors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.tree.RuleNode;

import core.*;
import grammar.*;
import grammar.DecibelParser.*;

//  FIXME: Make it so that functions + built in functions have a separate hashmap than variables
//  TODO: add dictionaries
//  TODO: fix syntax highlighter!!!

public class EvalVisitor extends DecibelParserBaseVisitor<Data<?>> {
    public static Stack<HashMap<String, Data<?>>> nameSpace = new Stack<>();
    public static HashMap<String, BuiltInFunction> builtInFunctions = new HashMap<>();

    public EvalVisitor() {
        nameSpace.push(new HashMap<String, Data<?>>());
        BuiltInFunctionsRegistrar.register(builtInFunctions);
    }

    public Data<?> findVariable(String id) {
        int size = nameSpace.size();
        for (int i = size - 1; i >= 0; i--) {
            Map<String, Data<?>> scope = nameSpace.get(i);
            if (scope.containsKey(id)) {
                return scope.get(id);
            }
        }
        return new NullData();
    }

    public void assign(String id, Data<?> data) {
        nameSpace.peek().put(id, data);
    }

    // Assign a variable
    @Override
    public Data<?> visitAssignment(AssignmentContext ctx) {
        String id = ctx.IDENTIFIER().getText(); // name of the variable
        Data<?> data = visit(ctx.expression()); // value to assign
        assign(id, data); // storing the value to the name
        return new NullData();
    }

    // If statement
    @Override
    public Data<?> visitIf(IfContext ctx) {
        if (visit(ctx.expression()).isTruthy()) {
            return visit(ctx.block(0));
        } else {
            if (ctx.block(1) != null) {
                return visit(ctx.block(1));
            } else if (ctx.if_() != null) {
                return visit(ctx.if_());
            }
        }
        return new NullData();
    }

    // While statement
    @Override
    public Data<?> visitWhile(WhileContext ctx) {
        Data<?> ret = new NullData();

        whileLabel: while (visit(ctx.expression()).isTruthy()) {
            var block = visit(ctx.block());
            ret = (block == null) ? new NullData() : block;

            switch (ret.getState()) {
                case BREAK:
                    ret.setState(ControlState.DEFAULT);
                    break whileLabel;
                case CONTINUE:
                    ret.setState(ControlState.DEFAULT);
                    continue whileLabel;
                case RETURN:
                    return ret;
                case DEFAULT:
                    break;
            }
        }
        return new NullData();
    }

    // For statement
    @Override
    public Data<?> visitFor(ForContext ctx) {
        Data<?> ret = new NullData();

        forLabel: for (visit(ctx.assignmentOrExpression(0)); visit(ctx.expression())
                .isTruthy(); visit(ctx.assignmentOrExpression(1))) {
            var block = visit(ctx.block());
            ret = (block == null) ? new NullData() : block;

            switch (ret.getState()) {
                case BREAK:
                    ret.setState(ControlState.DEFAULT);
                    break forLabel;
                case CONTINUE:
                    ret.setState(ControlState.DEFAULT);
                    continue forLabel;
                case RETURN:
                    return ret;
                case DEFAULT:
                    break;
            }
        }
        return ret;
    }

    @Override
    public NumberData visitRealExpression(RealExpressionContext ctx) {
        Double number = Double.valueOf(ctx.REAL().getText());
        return new NumberData(number);
    }

    @Override
    public StringData visitStringExpression(StringExpressionContext ctx) {
        String string = ctx.getText().substring(1, ctx.getText().length() - 1);
        return new StringData(string);
    }

    @Override
    public Data<?> visitBoolean(BooleanContext ctx) {
        Boolean bool = Boolean.parseBoolean(ctx.getText());
        return new BooleanData(bool);
    }

    @Override
    public Data<?> visitIdentifierExpression(IdentifierExpressionContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        return findVariable(id);
    }

    @Override
    public Data<?> visitUnaryExpression(UnaryExpressionContext ctx) {
        Data<?> data = visit(ctx.expression());
        var op = ctx.op.getType();
        return switch (op) {
            case DecibelLexer.NOT -> data.not();
            case DecibelLexer.ADD -> data.positive();
            case DecibelLexer.SUBTRACT -> data.negative();
            default -> new NullData();
        };
    }

    @Override
    public Data<?> visitComparisonExpression(ComparisonExpressionContext ctx) {
        Data<?> left = visit(ctx.expression(0));
        Data<?> right = visit(ctx.expression(1));
        var op = ctx.op.getType();
        return switch (op) {
            case DecibelLexer.LESSER_THAN -> left.lessThan(right);
            case DecibelLexer.GREATER_THAN -> left.greaterThan(right);
            case DecibelLexer.LESSER_THAN_OR_EQUAL_TO -> left.lessThanOrEqualsTo(right);
            case DecibelLexer.GREATER_THAN_OR_EQUAL_TO -> left.greaterThanOrEqualsTo(right);
            case DecibelLexer.EQUALS_TO -> left.equalsTo(right);
            default -> new NullData();
        };
    }

    @Override
    public Data<?> visitMultiplicationExpression(MultiplicationExpressionContext ctx) {
        Data<?> left = visit(ctx.expression(0));
        Data<?> right = visit(ctx.expression(1));
        var op = ctx.op.getType();
        return switch (op) {
            case DecibelLexer.MULTIPLY -> left.multiply(right);
            case DecibelLexer.DIVIDE -> left.divide(right);
            case DecibelLexer.MODULO -> left.modulo(right);
            default -> new NullData();
        };
    }

    @Override
    public Data<?> visitAdditionExpression(AdditionExpressionContext ctx) {
        Data<?> left = visit(ctx.expression(0));
        Data<?> right = visit(ctx.expression(1));
        var op = ctx.op.getType();
        return switch (op) {
            case DecibelLexer.ADD -> left.add(right);
            case DecibelLexer.SUBTRACT -> left.subtract(right);
            default -> new NullData();
        };
    }

    @Override
    public Data<?> visitPowerExpression(PowerExpressionContext ctx) {
        Data<?> left = visit(ctx.expression(0));
        Data<?> right = visit(ctx.expression(1));
        return left.power(right);
    }

    @Override
    public Data<?> visitBaseExpression(BaseExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Data<?> visitFunction(FunctionContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        if (!builtInFunctions.containsKey(id)) {
            FunctionData block = new FunctionData(ctx);
            nameSpace.peek().put(id, block);
            return block;
        }
        return new NullData();
    }

    @Override
    public Data<?> visitCall(CallContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Data<?> data = new NullData();

        // Check if the identifer of the call is a built in function
        if (builtInFunctions.containsKey(id)) {
            // Use the paramters for the built in function
            ArrayList<Data<?>> args = new ArrayList<>();
            for (int i = 0; i < ctx.actualParameters().expression().size(); i++) {
                args.add(visit(ctx.actualParameters().expression(i)));
            }
            data = builtInFunctions.get(id).call(args);
        } else {
            // Use the paramters for the user defined function
            var function = (FunctionData) findVariable(id);

            nameSpace.push(new HashMap<String, Data<?>>());
            for (int i = 0; i < function.getValue().formalParameters().IDENTIFIER().size(); i++) {
                nameSpace.peek().put(function.getValue().formalParameters().IDENTIFIER(i).getText(),
                        visit(ctx.actualParameters().expression(i)));
            }

            data = visit(function.getValue().block());
            data.setState(ControlState.DEFAULT);
            nameSpace.pop();
        }
        return data;
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Data<?> currentResult) {
        if (currentResult != null) {
            return (currentResult.getState() == ControlState.DEFAULT);
        }
        return true;
    }

    @Override
    public Data<?> visitReturnStatment(ReturnStatmentContext ctx) {
        Data<?> data = visit(ctx.expression());
        data.setState(ControlState.RETURN);
        return data;
    }

    // TODO: Make it so that NumberData or any of it's sibilings has to be
    // instantiated for control flow to work here
    // FIXME: Redo the control flow system in general
    @Override
    public Data<?> visitBreakStatement(BreakStatementContext ctx) {
        Data<?> data = new NullData();
        data.setState(ControlState.BREAK);
        return data;
    }

    // TODO: Make it so that NumberData or any of it's sibilings has to be
    // instantiated for control flow to work here
    // FIXME: Redo the control flow system in general
    @Override
    public Data<?> visitContinueStatement(ContinueStatementContext ctx) {
        Data<?> data = new NullData();
        data.setState(ControlState.CONTINUE);
        return data;
    }

    @Override
    public ListData visitList(ListContext ctx) {
        ArrayList<Data<?>> list = new ArrayList<>();

        for (int i = 0; i < ctx.actualParameters().expression().size(); i++) {
            Data<?> entry = visit(ctx.actualParameters().expression(i));
            list.add(entry);
        }
        return new ListData(list);
    }

    @Override
    public Data<?> visitIndex(IndexContext ctx) {
        Data<?> expression = visit(ctx.expression());
        String id = ctx.IDENTIFIER().getText();
        var index = expression.getValue();
        var list = (ListData) findVariable(id);

        // FIXME: get rid of pattern matching here by making this polymorphic somehow
        return switch (index) {
            case Double d -> list.getValue().get(d.intValue());
            default -> throw new UnsupportedOperationException("Must use number for list index");
        };
    }

    @Override
    public NumberData visitLength(LengthContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        var list = (ListData) findVariable(id);
        return new NumberData((double) list.getValue().size());
    }

    @Override
    public Data<?> visitPrefixIncrement(PrefixIncrementContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Data<?> data = findVariable(id);
        var op = ctx.op.getType();
        var incrementedData = switch (op) {
            case DecibelLexer.INCREMENT -> data.increment();
            case DecibelLexer.DECREMENT -> data.decrement();
            default -> new NullData();
        };
        assign(id, incrementedData);
        return incrementedData;
    }

    @Override
    public Data<?> visitPostfixIncrement(PostfixIncrementContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Data<?> data = findVariable(id);
        var op = ctx.op.getType();
        var incrementedData = switch (op) {
            case DecibelLexer.INCREMENT -> data.increment();
            case DecibelLexer.DECREMENT -> data.decrement();
            default -> new NullData();
        };
        assign(id, incrementedData);
        return data;
    }
}

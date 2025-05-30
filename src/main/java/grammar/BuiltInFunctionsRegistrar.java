package grammar;

import java.util.HashMap;
import java.util.Scanner;

public class BuiltInFunctionsRegistrar extends EvalVisitor {
    public static Scanner scanner = new Scanner(System.in);

    public static void register(HashMap<String, BuiltInFunction> builtInFunctions) {

        builtInFunctions.put("print", (args) -> {
            var data = (Data<?>) args.get(0);
            System.out.println(data);
            return null;
        });

        builtInFunctions.put("min", (args) -> {
            var num1 = (NumberData) args.get(0);
            var num2 = (NumberData) args.get(1);
            return new NumberData(Math.min(num1.getValue(), num2.getValue()));
        });

        builtInFunctions.put("max", (args) -> {
            var num1 = (NumberData) args.get(0);
            var num2 = (NumberData) args.get(1);
            return new NumberData(Math.max(num1.getValue(), num2.getValue()));
        });

        builtInFunctions.put("abs", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.abs(num.getValue()));
        });

        builtInFunctions.put("sqrt", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.sqrt(num.getValue()));
        });

        builtInFunctions.put("pow", (args) -> {
            var num1 = (NumberData) args.get(0);
            var num2 = (NumberData) args.get(1);
            return new NumberData(Math.pow(num1.getValue(), num2.getValue()));
        });

        builtInFunctions.put("sin", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.sin(num.getValue()));
        });

        builtInFunctions.put("cos", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.cos(num.getValue()));
        });

        builtInFunctions.put("tan", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.tan(num.getValue()));
        });

        builtInFunctions.put("asin", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.asin(num.getValue()));
        });

        builtInFunctions.put("acos", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.acos(num.getValue()));
        });

        builtInFunctions.put("atan", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.atan(num.getValue()));
        });

        builtInFunctions.put("ceil", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.ceil(num.getValue()));
        });

        builtInFunctions.put("round", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData((double) Math.round(num.getValue()));
        });

        builtInFunctions.put("ceil", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.ceil(num.getValue()));
        });

        builtInFunctions.put("floor", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.floor(num.getValue()));
        });

        builtInFunctions.put("ln", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.log(num.getValue()));
        });

        builtInFunctions.put("log", (args) -> {
            var num = (NumberData) args.get(0);
            return new NumberData(Math.log10(num.getValue()));
        });

        builtInFunctions.put("append", (args) -> {
            var list = (ListData) args.get(0);
            var data = (Data<?>) args.get(1);
            list.getValue().add(data);
            return list;
        });

        builtInFunctions.put("insert", (args) -> {
            var list = (ListData) args.get(0);
            var data = (Data<?>) args.get(1);
            var index = (NumberData) args.get(2);
            list.getValue().add(index.getValue().intValue(), data);
            return list;
        });

        builtInFunctions.put("remove", (args) -> {
            var list = (ListData) args.get(0);
            var index = (NumberData) args.get(1);
            list.getValue().remove(index.getValue().intValue());
            return list;
        });

        builtInFunctions.put("str", (args) -> {
            var data = (Data<?>) args.get(0);
            return new StringData(data.toString());
        });

        builtInFunctions.put("int", (args) -> {
            var data = (StringData) args.get(0);
            return new NumberData(Double.parseDouble(data.getValue()));
        });

        builtInFunctions.put("input", (args) -> {
            var data = (StringData) args.get(0);
            System.out.print(data.getValue());

            String input = scanner.nextLine();
            return new StringData(input);
        });
    }
}

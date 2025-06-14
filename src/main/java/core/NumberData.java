package core;

public final class NumberData extends Data<Double> {

    public NumberData(Double value) {
        super(value);
    }

    @Override
    public Data<?> add(Data<?> other) {
        return switch (other) {
            case NumberData n -> new NumberData(getValue() + n.getValue());
            case StringData s -> new StringData(getValue() + s.getValue());
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public Data<?> subtract(Data<?> other) {
        return switch (other) {
            case NumberData n -> new NumberData(getValue() - n.getValue());
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public Data<?> multiply(Data<?> other) {
        return switch (other) {
            case NumberData n -> new NumberData(getValue() * n.getValue());
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public Data<?> divide(Data<?> other) {
        return switch (other) {
            case NumberData n -> new NumberData(getValue() / n.getValue());
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public Data<?> power(Data<?> other) {
        return switch (other) {
            case NumberData n -> new NumberData(Math.pow(getValue(), n.getValue()));
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public Data<Boolean> lessThan(Data<?> other) {
        return switch (other) {
            case NumberData n -> new BooleanData(getValue() < n.getValue());
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public Data<Boolean> lessThanOrEqualsTo(Data<?> other) {
        return switch (other) {
            case NumberData n -> new BooleanData(getValue() <= n.getValue());
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public Data<Boolean> greaterThan(Data<?> other) {
        return switch (other) {
            case NumberData n -> new BooleanData(getValue() > n.getValue());
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public Data<Boolean> greaterThanOrEqualsTo(Data<?> other) {
        return switch (other) {
            case NumberData n -> new BooleanData(getValue() >= n.getValue());
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public Data<Boolean> equalsTo(Data<?> other) {
        return switch (other) {
            case NumberData n -> new BooleanData(getValue().equals(n.getValue()));
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public Data<?> increment() {
        return new NumberData(getValue() + 1);
    }

    @Override
    public Data<?> decrement() {
        return new NumberData(getValue() - 1);
    }

    @Override
    public Data<Boolean> asBoolean() {
        Boolean bool = getValue() != 0.0 && !Double.isNaN(getValue());
        return new BooleanData(bool);
    }

    @Override
    public Data<?> negative() {
        return new NumberData(-getValue());
    }

    @Override
    public String toString() {
        return Double.toString(getValue());
    }
}
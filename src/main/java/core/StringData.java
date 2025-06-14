package core;

public final class StringData extends Data<String> {

    public StringData(String value) {
        super(value);
    }

    @Override
    public Data<?> add(Data<?> other) {
        return switch (other) {
            case NumberData n -> new StringData(getValue() + n.getValue());
            case StringData s -> new StringData(getValue() + s.getValue());
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public Data<Boolean> equalsTo(Data<?> other) {
        return switch (other) {
            case StringData s -> new BooleanData(getValue().equals(s.getValue()));
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public String toString() {
        return getValue();
    }
}

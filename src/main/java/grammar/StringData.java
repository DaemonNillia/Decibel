package grammar;

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
    public String toString() {
        return getValue();
    }
}

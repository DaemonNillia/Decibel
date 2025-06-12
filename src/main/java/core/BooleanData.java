package core;

public final class BooleanData extends Data<Boolean> {

    public BooleanData(Boolean value) {
        super(value);
    }

    @Override
    public Data<Boolean> equalsTo(Data<?> other) {
        return switch (other) {
            case BooleanData b -> new BooleanData(getValue() == b.getValue());
            default -> throw new UnsupportedOperationException("Unsupported operation");
        };
    }

    @Override
    public Data<Boolean> asBoolean() {
        return this;
    }

    @Override
    public String toString() {
        return Boolean.toString(getValue());
    }
}

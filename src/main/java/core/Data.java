package core;

import grammar.DataInterface;

public abstract class Data<T> implements DataInterface<T> {

    private T value;
    protected ControlState state;

    Data(T value) {
        this.value = value;
        this.state = ControlState.DEFAULT;
    }

    Data(T value, ControlState state) {
        this.value = value;
        this.state = state;
    }

    public Data<?> add(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public Data<?> subtract(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'subtract'");
    }

    public Data<?> multiply(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'multiply'");
    }

    public Data<?> divide(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'divide'");
    }

    public Data<?> power(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'power'");
    }

    public Data<?> modulo(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'modulo'");
    }

    public Data<Boolean> lessThan(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'lessThan'");
    }

    public Data<Boolean> lessThanOrEqualsTo(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'lessThanOrEqualsTo'");
    }

    public Data<Boolean> greaterThan(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'greaterThan'");
    }

    public Data<Boolean> greaterThanOrEqualsTo(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'greaterThanOrEqualsTo'");
    }

    public Data<Boolean> equalsTo(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'equalsTo'");
    }

    public Data<Boolean> asBoolean() {
        throw new UnsupportedOperationException("Type cannot be converted to a boolean");
    }

    public Boolean isTruthy() {
        return asBoolean().getValue();
    }

    public Data<?> not() {
        throw new UnsupportedOperationException("Unimplemented method 'not'");
    }

    public Data<?> negative() {
        throw new UnsupportedOperationException("Unimplemented method 'negative'");
    }

    public Data<?> positive() {
        throw new UnsupportedOperationException("Unimplemented method 'positive'");
    }

    public Data<?> increment() {
        throw new UnsupportedOperationException("Unimplemented method 'increment'");
    }

    public Data<?> decrement() {
        throw new UnsupportedOperationException("Unimplemented method 'decrement'");
    }

    public Data<?> length() {
        throw new UnsupportedOperationException("Unimplemented method 'length'");
    }

    public T getValue() {
        return value;
    }

    public ControlState getState() {
        return state;
    }

    public void setState(ControlState state) {
        this.state = state;
    }
}
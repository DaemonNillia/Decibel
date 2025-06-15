package core;

/**
 * <p>
 * The Data class wraps any given value. It is the general type that is returned
 * in visits within the parser. An object of type Data contains a field for that
 * data and another field for it's control state.
 * </p>
 * <p>
 * In addition, this class provides many methods for interacting with other
 * instances of Data that wrap different values. The default implementations of
 * these methods throw errors and must be implemented by an extending class.
 * </p>
 */
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

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<?> add(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<?> subtract(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'subtract'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<?> multiply(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'multiply'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<?> divide(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'divide'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<?> power(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'power'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<?> modulo(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'modulo'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<Boolean> lessThan(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'lessThan'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<Boolean> lessThanOrEqualsTo(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'lessThanOrEqualsTo'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<Boolean> greaterThan(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'greaterThan'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<Boolean> greaterThanOrEqualsTo(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'greaterThanOrEqualsTo'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<Boolean> equalsTo(Data<?> other) {
        throw new UnsupportedOperationException("Unimplemented method 'equalsTo'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<Boolean> asBoolean() {
        throw new UnsupportedOperationException("Type cannot be converted to a boolean");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Boolean isTruthy() {
        return asBoolean().getValue();
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<?> not() {
        throw new UnsupportedOperationException("Unimplemented method 'not'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<?> negative() {
        throw new UnsupportedOperationException("Unimplemented method 'negative'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<?> positive() {
        throw new UnsupportedOperationException("Unimplemented method 'positive'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<?> increment() {
        throw new UnsupportedOperationException("Unimplemented method 'increment'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<?> decrement() {
        throw new UnsupportedOperationException("Unimplemented method 'decrement'");
    }

    /**
     * {@inheritDoc}
     * 
     * <p>
     * The default implemntation returns an error
     * </p>
     */
    public Data<?> length() {
        throw new UnsupportedOperationException("Unimplemented method 'length'");
    }

    /**
     * {@inheritDoc}
     */
    public T getValue() {
        return value;
    }

    /**
     * {@inheritDoc}
     */
    public ControlState getState() {
        return state;
    }

    /**
     * {@inheritDoc}
     */
    public void setState(ControlState state) {
        this.state = state;
    }
}
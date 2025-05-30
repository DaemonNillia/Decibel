package grammar;

public interface DataInterface<T> {

    // Arithmetic
    public Data<?> add(Data<?> other);

    public Data<?> subtract(Data<?> other);

    public Data<?> multiply(Data<?> other);

    public Data<?> divide(Data<?> other);

    public Data<?> power(Data<?> other);

    public Data<?> modulo(Data<?> other);

    // Comparison
    public Data<Boolean> lessThan(Data<?> other);

    public Data<Boolean> lessThanOrEqualsTo(Data<?> other);

    public Data<Boolean> greaterThan(Data<?> other);

    public Data<Boolean> greaterThanOrEqualsTo(Data<?> other);

    public Data<Boolean> equalsTo(Data<?> other);

    // Boolean Helpers
    public Data<Boolean> asBoolean();

    public Boolean isTruthy();

    // Unary
    public Data<?> not();

    public Data<?> negative();

    public Data<?> positive();

    public Data<?> increment();

    public Data<?> decrement();

    public Data<?> length();

    // Value getter
    public T getValue();
}

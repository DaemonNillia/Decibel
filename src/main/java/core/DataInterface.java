package core;

/**
 * The DataInterface interface defines the methods used by the Data class and
 * its sub-classes.
 */
public interface DataInterface<T> {
    /**
     * Add data by some other data
     * 
     * @param other Data to add by
     * @return The sum
     */
    Data<?> add(Data<?> other);

    /**
     * Subtract data by some other data
     * 
     * @param other Data to subtract by
     * @return The difference
     */
    Data<?> subtract(Data<?> other);

    /**
     * Multiply data by some other data
     * 
     * @param other Data to multiply by
     * @return The product
     */
    Data<?> multiply(Data<?> other);

    /**
     * Divide data by some other data
     * 
     * @param other Data to divide by
     * @return The quotient
     */
    Data<?> divide(Data<?> other);

    /**
     * Power data by some other data
     * 
     * @param other Data to power by
     * @return The result
     */
    Data<?> power(Data<?> other);

    /**
     * Mod data by some other data
     * 
     * @param other Data to mod by
     * @return The mod
     */
    Data<?> modulo(Data<?> other);

    /**
     * Less than comparison
     * 
     * @param other Data to compare by
     * @return The result
     */
    Data<Boolean> lessThan(Data<?> other);

    /**
     * Less than or equals to comparison
     * 
     * @param other Data to compare by
     * @return The result
     */
    Data<Boolean> lessThanOrEqualsTo(Data<?> other);

    /**
     * Greater than comparison
     * 
     * @param other Data to compare by
     * @return The result
     */
    Data<Boolean> greaterThan(Data<?> other);

    /**
     * Greater than or equals to comparison
     * 
     * @param other Data to compare by
     * @return The result
     */
    Data<Boolean> greaterThanOrEqualsTo(Data<?> other);

    /**
     * Equals to comparison
     * 
     * @param other Data to compare by
     * @return The result
     */
    Data<Boolean> equalsTo(Data<?> other);

    /**
     * Returns the data as a boolean
     * 
     * @return The data as a boolean
     */
    Data<Boolean> asBoolean();

    /**
     * Returns the data as a boolean if truthy
     * 
     * @return The truthy data
     */
    Boolean isTruthy();

    /**
     * Logically negate data
     * 
     * @return The data logically negated
     */
    Data<?> not();

    /**
     * Negates the data
     * 
     * @return The data negated
     */
    Data<?> negative();

    /**
     * "Positive" something? I only end up using this to just do nothing
     * when doing {@code +number} and errors otherwise
     * 
     * @return The number positived
     */
    Data<?> positive();

    /**
     * Increment data
     * 
     * @return The incremented data
     */
    Data<?> increment();

    /**
     * Decrement data
     * 
     * @return The data decremented
     */
    Data<?> decrement();

    /**
     * Get the data's "length"
     * 
     * @return The length of the data
     */
    Data<?> length();

    /**
     * The value of the data
     * 
     * @return The value of the data
     */
    T getValue();

    /**
     * Return the data's current control state
     * 
     * @return The control state of the data
     */
    ControlState getState();

    /**
     * Set the data's control state
     * 
     * @param state The new control state
     */
    void setState(ControlState state);
}

package bma.amine;

public class NumberOutOfBoundsException extends Exception {
    private int value;
    NumberOutOfBoundsException(int val)
    {
        value=val;
    }
    public String toString() {
        return "NumberOutOfBoundsException";
    }
    public String getMessage() {
        return value + " est trop grand";
    }
}

package bma.amine;

public class NegativeArgumentException extends Exception {
    private int value;
    NegativeArgumentException(int val)
    {
        value=val;
    }
    public String toString() {
        return "NegativeArgumentException";
    }
    public String getMessage() {
        return value + " est négatif";
    }
}

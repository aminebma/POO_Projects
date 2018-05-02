package tdGui.Noyau;

public class Calcul {
    public static double somme(double a, double b) {
        return (a + b);
    }

    public static double sous(double a, double b) {
        return (a - b);
    }

    public static double multipl(double a, double b) {
        return (a * b);
    }

    public static int init() {
        return 0;
    }

    public static double division(double a, double b) {
        double result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return result;
    }
}

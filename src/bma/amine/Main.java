package bma.amine;

public class Main {

    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]),
                    fact = 1;
            if (n < 0) throw new NegativeArgumentException(n);
            if (n > 31) throw new NumberOutOfBoundsException(n);
            for (int i = 2; i <= n; i++) fact = fact * i;
            System.out.println("Resultat=" + fact);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Paramétre absent");
        } catch (NumberFormatException e) {
            System.out.println("Veuillez entrer un entier");
        } catch (NegativeArgumentException e) {
            System.out.println(e+" "+e.getMessage());
        } catch (NumberOutOfBoundsException e) {
            System.out.println(e+": "+e.getMessage());
        }

    }
}

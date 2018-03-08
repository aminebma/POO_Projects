package bma.amine;

public class Main {

    public static void main(String[] args) {
        EnsembleTrieChaine e = new EnsembleTrieChaine();
        e.inserer("toto");
        e.inserer("titi");
        e.inserer("tutu");
        e.inserer("toto");
        System.out.println(e);
        String s = e.concat();
        System.out.println(e);
    }
}

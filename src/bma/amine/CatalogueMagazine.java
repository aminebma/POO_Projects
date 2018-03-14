package bma.amine;

import java.util.TreeMap;
import java.util.TreeSet;

public class CatalogueMagazine implements Catalogue {
    //Methode 1
    //private TreeSet<Magazine> magazines;
    //Il faudra redéfinir equals sur le titre et le numéro, et redéfinir compareTo

    //Methode 2
    private TreeMap<String,TreeMap<Integer,Magazine>> magazines;

    //Methode 3
    //l'instance est considérée comme un int
}

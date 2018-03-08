package bma.amine;

import java.util.Iterator;

public class EnsembleTrieChaine extends EnsembleTrie {

    public String concat() {
        Iterator<String> it = getContenu().iterator();
        String chaine="";
        while (it.hasNext()) {
            chaine+=it.next();
        }
        return chaine;
    }
}

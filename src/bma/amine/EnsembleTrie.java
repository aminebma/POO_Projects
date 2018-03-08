package bma.amine;

import java.util.Iterator;
import java.util.TreeSet;

public abstract class EnsembleTrie {
    private TreeSet contenu = new TreeSet();

    public void inserer(Object o )
    {
        contenu.add(o);
    }

    public void supprimer(Object o) {
        contenu.remove(o);
    }

    public String toString() {
        String msg="{";
        Iterator it = contenu.iterator();
        while(it.hasNext())
        {
            msg=msg+"<"+it.next().toString()+">";
            if(it.hasNext()) msg=msg+", ";
        }
        return msg=msg+"}";
    }

    public int taille() {
        return contenu.size();
    }

    public Object element(int i) {
        if (i > contenu.size() || contenu.isEmpty()) return null;
        else {

            Iterator it = contenu.iterator();
            int cpt=0;
            while (cpt < i && it.hasNext()) {
                it.next();
                cpt++;
            }
            return it.next();
        }
    }

    public TreeSet getContenu() {
        return contenu;
    }

    public void setContenu(TreeSet contenu) {
        this.contenu = contenu;
    }
}

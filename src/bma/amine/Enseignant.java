package bma.amine;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Enseignant extends Personne implements Comparable{
    private long numSec;
    private String[] modules;

    public Enseignant(String lastName, String firstName, String birthDay,long numSecu,String[] modules)
    {
        super(lastName,firstName,birthDay);
        this.modules=modules;
        numSec=numSecu;
    }


    public int compareTo(Object o) {
        if(super.getNom().charAt(0)<((Personne)o).getNom().charAt(0))
        {
            if (super.getPrenom().charAt(0) < ((Personne) o).getNom().charAt(0)) return 1;
            else return 2;
        }
        if (super.getNom().charAt(0) > ((Personne) o).getNom().charAt(0)) {
            if (super.getPrenom().charAt(0) < ((Personne) o).getNom().charAt(0)) return -1;
            else return -2;
        }
        return 0;
    }

    public void AfficherType()
    {
        System.out.println("Enseignant");
    }

    public void Afficher()
    {
        for(String s : modules) System.out.print(s+"\n");
        System.out.println("numSecu:"+numSec);
    }

    public long getNumSec() {
        return numSec;
    }
}

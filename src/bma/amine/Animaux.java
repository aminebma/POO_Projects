package bma.amine;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Animaux {

    //private Set<Animal> animaux;
    private TreeSet<Animal> animaux;

    public Animaux()
    {
        animaux = new TreeSet<Animal>();
        //animaux = new HashSet<Animal>();
    }

    public boolean AddAnimal(Animal animal)
    {
       return animaux.add(animal);
    }

    /*public Set<Animal> getAnimaux() {
        return animaux;
    }*/

    /*public void setAnimaux(Set<Animal> animaux) {
        this.animaux = animaux;
    }*/

    public TreeSet<Animal> getAnimaux() {
        return animaux;
    }

    public void setHwayech(TreeSet<Animal> animaux) {
        this.animaux = animaux;
    }

    public void afficherAnimaux()
    {
        /*Iterator<Animal> it = animaux.iterator();
        System.out.println("Animaux:\n********");
        while(it.hasNext()){
            System.out.println(it.next().getNom());
        }*/

        Iterator<Animal> it = animaux.iterator();
        for(Animal animal : animaux){
            System.out.println(it.next().getNom());
        }
    }
}

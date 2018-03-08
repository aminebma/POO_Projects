package bma.amine;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Animaux {

    public Set<Animal> hwayech;
    //public TreeSet<Animal> hwayech;

    public Animaux()
    {
        //hwayech = new TreeSet<Animal>();
        hwayech = new HashSet<Animal>();
    }

    public boolean AddAnimal(Animal haycha)
    {
       return hwayech.add(haycha);
    }

    public Set<Animal> getHwayech() {
        return hwayech;
    }

    public void setHwayech(Set<Animal> hwayech) {
        this.hwayech = hwayech;
    }

    public void afficherAnimaux()
    {
        /*Iterator<Animal> it = hwayech.iterator();
        System.out.println("Animaux:\n********");
        while(it.hasNext()){
            System.out.println(it.next().getNom());
        }*/

        Iterator<Animal> it = hwayech.iterator();
        for(Animal haycha : hwayech){
            System.out.println(it.next().getNom());
        }
    }
}

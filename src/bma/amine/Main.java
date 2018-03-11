package bma.amine;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Animaux animaux = new Animaux();
        Animal  animal1 = new Animal("Lion"),
                animal2 = new Animal("Giraffe"),
                animal3 = new Animal("Lion"),
                animal4 = new Animal("Chien");

        animaux.AddAnimal(animal1);
        animaux.AddAnimal(new Animal("Giraffe"));
        animaux.AddAnimal(animal2);
        animaux.AddAnimal(animal3);
        animaux.AddAnimal(animal4);

        animaux.afficherAnimaux();

//        Part 2

        System.out.println("\nPart 2");

        ArrayList<Animal> animal = new ArrayList<Animal>(/*(Collection<Animal>)*/animaux.getAnimaux());
        animal.add(new Animal("Lion"));
        animal.add(new Animal("Giraffe"));
        animal.add(new Animal("Lion"));
        animal.add(new Animal("Chien"));

        Collections.sort(animal);

        for(Animal hay : animal)
            System.out.println(hay.getNom());

//        Part 3

        Map<Tatouage, Animal> map = new HashMap<Tatouage,Animal>();
//        Map<Tatouage, Animal> map = new TreeMap<Tatouage, Animal>();

        map.put(new Tatouage(animal1.getNom()), animal1);
        map.put(new Tatouage(animal2.getNom()), animal2);
        map.put(new Tatouage(animal3.getNom()), animal3);
        map.put(new Tatouage(animal4.getNom()), animal4);

        System.out.println("\nLes elements de la map sont:");
        for(Map.Entry<Tatouage,Animal> entry : map.entrySet())
            System.out.println("Clé = "+entry.getKey().getNum()+" valeur: "+entry.getValue().getNom());


    }
}

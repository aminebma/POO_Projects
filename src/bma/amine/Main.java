package bma.amine;

public class Main {

    public static void main(String[] args) {
        Animaux hwayech = new Animaux();
        Animal  haycha1 = new Animal("Lion"),
                haycha2 = new Animal("Giraffe"),
                haycha3 = new Animal("Lion"),
                haycha4 = new Animal("Chien");

        hwayech.AddAnimal(haycha1);
        hwayech.AddAnimal(new Animal("Giraffe"));
        hwayech.AddAnimal(haycha2);
        hwayech.AddAnimal(haycha3);
        hwayech.AddAnimal(haycha4);

        hwayech.afficherAnimaux();
    }
}

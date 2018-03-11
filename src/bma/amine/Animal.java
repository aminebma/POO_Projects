package bma.amine;

public class Animal implements Comparable<Animal>{
    private String nom;

    public Animal(String nom)
    {
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /*public boolean equals(Animal animal){
        return this.nom.equals(animal.nom);
    }*/

    public boolean equals(Object o){
        if(o == null) return false;
        if(!(o instanceof Animal)) return  false;
        //return (this.nom==((Animal)o).nom);
        return this.nom.equals(((Animal)o).nom);
    }

    public int hashCode(){
        return nom.hashCode();
    }

    public int compareTo(Animal animal) {
        return nom.compareTo(animal.nom);
    }
}

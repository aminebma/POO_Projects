package bma.amine;

public class Animal {
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

    /*public boolean equals(Animal haycha){
        return this.nom.equals(haycha.nom);
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

}

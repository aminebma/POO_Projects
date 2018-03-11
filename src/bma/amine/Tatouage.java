package bma.amine;

public class Tatouage implements Comparable<Tatouage>{

    private String nom;
    private int num;
    private static int nb;

    public Tatouage(String nom) {
        this.nom = nom;
        this.num=nb;
        nb++;
    }

    public int getNum() {
        return num;
    }

    public boolean equals(Object o){
        if(o == null) return false;
        if(!(o instanceof Tatouage)) return  false;
        //return (this.nom==((Tatouage)o).nom);
        return (this.nom+this.num).equals(((Tatouage)o). nom+num);
    }

    public int hashCode(){
        return (this.nom+this.num).hashCode();
    }

    @Override
    public int compareTo(Tatouage tatouage) {
        return (nom+num).compareTo(tatouage.nom+tatouage.num);
    }
}

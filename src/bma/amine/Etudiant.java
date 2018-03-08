package bma.amine;

public class Etudiant extends Personne implements Comparable{
    private int matricule;
    private double[] notes;

    public Etudiant(String lastName, String firstName, String birthDay,int mat, double[] note)
    {
        super(lastName,firstName,birthDay);
        notes=note;
        matricule=mat;
    }

    public double calculMoyenne(double[] notes)
    {
        return((notes[0]+notes[1]+notes[2])/3);
    }

    public int compareTo(Object o) {
        if (this.calculMoyenne(notes) < ((Etudiant) o).calculMoyenne(notes)) return -1;
        else if (this.calculMoyenne(notes) > ((Etudiant) o).calculMoyenne(notes)) return 1;
        else return 0;
    }

    public void AfficherType()
    {
        System.out.println("Etudiant");
    }

    public void Afficher()
    {
        System.out.print("Matricule:"+matricule+" notes:"+notes[0]+" "+notes[1]+" "+notes[2]+"\n Moyenne:"+calculMoyenne(notes)+"\n");
    }
    public int getMatricule() {
        return matricule;
    }

    public double[] getNotes() {
        return notes;
    }
}

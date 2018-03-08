package bma.amine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] modules = {"POO", "ARCHI3", "COMPIL", "MCSI"};
        List<String> nom= new ArrayList<String>(),prenom = new ArrayList<String>(),dateNaiss= new ArrayList<String>();
        double[] notes={12,15,5};
        List<Integer> mat= new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<3;i++) {
            System.out.print("Entrez le nom:");
            nom.add(sc.nextLine());
            System.out.print("Entrez le Prenom:");
            prenom.add(sc.nextLine());
            System.out.print("Entrez la date de naissance:");
            dateNaiss.add(sc.nextLine());
            System.out.print("Entrez le matricule:");
            mat.add(sc.nextInt());
            sc.nextLine();
        }
//      Personne insane = new Personne(nom.get(0),prenom.get(0),dateNaiss.get(0));
//	    insane.Afficher();
	    Enseignant chikh = new Enseignant("HIDOUCI","Khaled","25/12/0000",1548,modules);
	    chikh.Afficher();
        Personne[] nass= new Personne[]{new Etudiant(nom.get(0),prenom.get(0),dateNaiss.get(0),mat.get(0),notes),new Etudiant(nom.get(1),prenom.get(1),dateNaiss.get(1),mat.get(1),notes),
                                        new Etudiant(nom.get(2),prenom.get(2),dateNaiss.get(2),mat.get(2),notes),new Enseignant("HIDOUCI","Khaled","25/12/0000",1548,modules),
                                        new Enseignant("HIDOUCI","Khaled","25/12/0000",1548,modules)};
        for(Personne abd : nass) {
            abd.AfficherType();
            abd.Afficher();
        }
    }
}

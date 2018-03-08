package bma.amine;

public abstract  class Personne {
    private String nom,prenom,dateNaissance;

    public Personne(String lastName,String firstName, String birthDay)
    {
        nom=lastName.toLowerCase();
        prenom=firstName.toLowerCase();
        dateNaissance=birthDay;
    }

    public abstract  void AfficherType();

    public void Afficher()
    {
        System.out.println("Nom:"+nom+" Prénom:"+prenom+" Date de naissance:"+dateNaissance);
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

}


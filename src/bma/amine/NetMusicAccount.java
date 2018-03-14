package bma.amine;

public class NetMusicAccount {

    //Cette classe lance l'exception IdentifiantIncorrectException
    private String username,password;

    public boolean Authentification(String user, String pass){
        return (user== username && pass == password) ? true : false;
    }
}

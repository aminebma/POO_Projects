package tdGui.IU;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.*;

public class Acceuil extends Stage {
    public Acceuil(){
        this.setTitle("Accueil");
        this.setResizable(false);
        Label etiq=creerMessage("Bienvenue,\nA partir de cette fenêtre, vous pouvez lancer la calculatrice ou quitter.");
        Button calculatriceBouton=creerBouton("Calculatrice");
        Button quitterBouton=creerBouton("Quitter");
        Button[] boutons={calculatriceBouton,quitterBouton};
        this.setScene(new Scene(creerLayout(etiq, boutons),800,400));
    }
    public Label creerMessage(String s) {
        Label etiquette = new Label(s);
        etiquette.setAlignment(Pos.CENTER);
        etiquette.setFont(Font.font ("Verdana", 20));
        etiquette.setLineSpacing(20);
        return etiquette;
    }
    public Button creerBouton(String s) {
        Button bouton = new Button(s);
        bouton.setPrefSize(120,40);
        bouton.setFont(Font.font ("Verdana", 20));
        if("Calculatrice".equals(s)){
            bouton.setDefaultButton(true);
            bouton.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent actionEvent)
                { Calculatrice calculatrice=new Calculatrice();
                    hide();
                    calculatrice.show();
                }} );
        }
        else{
            bouton.setCancelButton(true);
            bouton.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent actionEvent) {
                    Platform.exit();
                }});
        }
        return bouton;
    }
    public VBox creerLayout(Label ecran, Button[] boutons) {
        VBox contenu=new VBox(120);
        contenu.setPadding(new Insets(20,20,20,20));
        contenu.setAlignment(Pos.CENTER);
        FlowPane commandes = new FlowPane();
        commandes.setAlignment(Pos.CENTER);
        commandes.setHgap(70);
        commandes.getChildren().setAll(boutons);
        contenu.getChildren().setAll(ecran,commandes);
        return contenu;
    }
}

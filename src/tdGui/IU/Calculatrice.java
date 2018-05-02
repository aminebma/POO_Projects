package tdGui.IU;
import com.sun.prism.paint.Color;
import sun.plugin2.util.ColorUtil;
import tdGui.Noyau.Calcul;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;
import javafx.geometry.Insets;
import javafx.scene.text.Font;

public class Calculatrice extends Stage {
    private static final String[]textBoutons = {"7", "8", "9", "/","4", "5", "6",
            "*" ,"1", "2", "3", "-" , "0", "c", "=", "+" };
    private final Map<String, Button> accelerateurs = new HashMap<String, Button>();
    private double value=0;
    private double cacheValue=0;
    private enum Op { NOOP, SOMME, SOUS, MULTIP, DIVIS }
    private Op opCourrante = Op.NOOP;
    private Op opDeclench = Op.NOOP;
    private TextField ecran=creerEcran();
    final GridPane boutons = creerBoutons();
    private double op=0;
    private boolean pressed=false,waiting=false;
    private Calcul calc;
    public Calculatrice(){
        calc = new Calcul();
        this.setTitle("Calculatrice");
        this.setResizable(false);
        this.setScene(new Scene(creerLayout(ecran,boutons), 280, 340));
    }
    private TextField creerEcran() {
        TextField ecran = new TextField();
        ecran.setPrefSize(240,50);
        ecran.setAlignment(Pos.TOP_CENTER);
        ecran.setEditable(false);
        return ecran;
    }

    private GridPane creerBoutons() {
        GridPane boutons = new GridPane();
        boutons.add(creerBouton("7"),0,0);
        boutons.add(creerBouton("8"),1,0);
        boutons.add(creerBouton("9"),2,0);
        boutons.add(creerBouton("/"),3,0);
        boutons.add(creerBouton("4"),0,1);
        boutons.add(creerBouton("5"),1,1);
        boutons.add(creerBouton("6"),2,1);
        boutons.add(creerBouton("*"),3,1);
        boutons.add(creerBouton("1"),0,2);
        boutons.add(creerBouton("2"),1,2);
        boutons.add(creerBouton("3"),2,2);
        boutons.add(creerBouton("-"),3,2);
        boutons.add(creerBouton("0"),0,3);
        boutons.add(creerBouton("C"),1,3);
        boutons.add(creerBouton("="),2,3);
        boutons.add(creerBouton("+"),3,3);
        boutons.setHgap(20);
        boutons.setVgap(20);
        return boutons;
    }
    private Button creerBouton(final String s) {
        Button bouton = new Button(s);
        bouton.setPrefSize(100,20);
        bouton.setFont(Font.font ("Ubuntu", 20));
        if(isNumeric(s))
        {
            bouton.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent actionEvent)
                {
                    if("0".equals(s) && ecran.getText()!="") ecran.setText(ecran.getText()+s);
                    else ecran.setText(ecran.getText()+s);
                }
            });
        }else {
            if ("+".equals(s)) {
                bouton.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(ActionEvent actionEvent)
                    {
                        if(waiting) {
                            op=calc.somme(op,Double.parseDouble(ecran.getText()));
                            ecran.setText(String.valueOf(op));
                            pressed=false;
                            waiting=false;
                        }else {
                            if(!pressed && !waiting)
                            {
                                op=Double.parseDouble(ecran.getText());
                                ecran.setText("");
                                pressed=true;
                                waiting=true;
                            }
                        }
                    }
                } );
            }
            if ("-".equals(s)) {
                bouton.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(ActionEvent actionEvent)
                    {
                    }
                } );
            }
            if ("*".equals(s)) {
                bouton.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(ActionEvent actionEvent)
                    {
                    }
                } );
            }
            if ("/".equals(s)) {
                bouton.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(ActionEvent actionEvent)
                    {
                    }
                } );
            }
        }
        return bouton;
    }
    private VBox creerLayout(TextField ecran, GridPane boutons) {
        VBox layout = new VBox(25);
        layout.setPadding(new Insets(20,20,20,20));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().setAll(ecran,boutons);
        return layout;
    }
    private void CreerEqualsBouton(Button bouton) {
        bouton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                switch (opDeclench) {
                    case SOMME:
                    case SOUS:
                    case MULTIP:
                    case DIVIS:
                }
                ecran.setText(Double.toString(value));
                value=0;
                cacheValue=0;
            }
        });
    }

    private boolean isNumeric(String s){
        try {
            int test = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
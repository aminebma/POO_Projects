package tdGui.IU;
import javafx.application.Application;
import javafx.stage.Stage;

public class ClassMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        Acceuil stage = new Acceuil();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
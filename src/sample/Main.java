package sample;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Create an object group that'll be root
//        Group root = new Group();
        BorderPane rootPane = new BorderPane();
        //Create a 600x300 scene from the root group
//        Scene scene = new Scene(root,600,300);
        Scene scene = new Scene(rootPane,600,300);

        //Coloring the scene
        scene.setFill(Color.BLUE);

        //Naming the stage
        primaryStage.setTitle("Hello world application !");

        //Add the scene to the stage
        primaryStage.setScene(scene);

        //Show the stage
        //primaryStage.show();

        //Creating buttons
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");

        // Border Pane

        rootPane.setTop(btn1);
        rootPane.setBottom(btn2);
        rootPane.setLeft(btn3);
        rootPane.setRight(btn4);
        rootPane.setCenter(btn5);
        primaryStage.show();

        // Hbox
        /*HBox rootBox = new HBox();
        rootBox.getChildren().add(btn1);
        rootBox.getChildren().add(btn2);
        rootBox.getChildren().add(btn3);
        rootBox.getChildren().add(btn4);
        rootBox.getChildren().add(btn5);
        primaryStage.show();*/

    }


    public static void main(String[] args) {
        launch(args);
    }
}

package javaFoundations.exercises.javafx;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Polygon;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;

public class Project extends Application {

    @Override
    public void start(Stage primaryStage) {
        //remove code from here
        Button btn = new Button();
        btn.setText("Alterar COR");
        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            Color[] colors = {Color.RED,Color.GRAY,Color.GREEN};
            int i=0;
            @Override
            public void handle(ActionEvent event) {
                if(i==3)
                    i=0;
                primaryStage.getScene().setFill(colors[i]);
                i++;
            }
        });
        Group root = new Group();
        Retangulo ret = new Retangulo();
        Polygon poly = new Polygon();
        poly.setScaleX(9);
        poly.setScaleY(11);
        Double[] coords= {100.0, 100.0,
                        100.0,120.0,
                        80.0, 120.0};
        Stop[] stops = {new Stop(0,Color.BLACK), new Stop(1,Color.BLUE)};
        LinearGradient lg= new LinearGradient(0,0,1.5,0,true, CycleMethod.NO_CYCLE,stops);
        poly.getPoints().addAll(coords);
        poly.setFill(lg);
        root.getChildren().add(poly);
        btn.setLayoutX(105);
        btn.setLayoutY(110);
        String path="/javaFoundations/exercises/javafx/img1.jpeg";
        Image img = new Image(getClass().getResource(path).toString());
        ImageView imV = new ImageView();
        imV.setImage(img);
        root.getChildren().add(imV);
        imV.setFitWidth(200);
        imV.setFitHeight(220);
        Text texto = new Text();
        texto.setText("COM INSONIA MEU BROTHER?");
        texto.setLayoutX(0);
        texto.setLayoutY(240);
        texto.setFill(Color.BLUE);
        texto.setFontSmoothingType(FontSmoothingType.LCD);
        root.getChildren().add(texto);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        //to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}

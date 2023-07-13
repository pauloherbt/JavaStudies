package javaFoundations.exercises.javafx.goaltest;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GoalTest_Student_9_3 extends Application {
    public static Group root = new Group();
    
    @Override
    public void start(Stage primaryStage) {
        //Instantiate a few Goal objects

        Scene scene = new Scene(root, 600, 500, Color.rgb(50,50,50));
        
        primaryStage.setTitle("GoalTest");
        primaryStage.setScene(scene);
        primaryStage.show();
        Goal_Student_9_3 t=new Goal_Student_9_3();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}

package javaFoundations.exercises.javafx.goaltest;

import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;

public class Goal_Student_9_3 {
    ImageView img;
    ImageView img2;
    AudioClip audioClip;
    public Goal_Student_9_3(){
       img = new ImageView(getClass().getResource("images/Duke.png").toString());
        img.setX(100);
        img.setY(20);
        img.setPreserveRatio(true);
        img.setFitWidth(100);
        img2= new ImageView(getClass().getResource("images/Glove.png").toString());
        img2.setX(140);
        img2.setY(12);
        img2.setPreserveRatio(true);
        img2.setFitWidth(60);
        GoalTest_Student_9_3.root.getChildren().addAll(img,img2);
        audioClip= new AudioClip(getClass().getResource("audio/Note5.wav").toString());
        interactions();
    }
    
    private void interactions(){
        //Exercise 4   
        img.setOnMousePressed((MouseEvent me)->{
            audioClip.play();
        });
        img.setOnMouseDragged((MouseEvent me)->{
            img.setX(me.getSceneX());
            img.setY(me.getSceneY());
        });
    }
}

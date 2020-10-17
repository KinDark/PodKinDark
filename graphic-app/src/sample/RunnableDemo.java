package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class RunnableDemo extends Application {
    private int counter;
    private Text counterDisplay = new Text(10,20, "Licznik trafień: " ) {
    };
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400, Color.AZURE);
        primaryStage.setScene(scene);
        primaryStage.show();
// tworzenie kółka
        Circle circle = new Circle(200,200, 20, Color.ORANGE);
//
        root.getChildren().addAll(circle, counterDisplay);

// tworzenie animacji kółka w Buncing
/* tak lub jak na dole
        Bouncing bouncingAnimation = new Bouncing(circle);
                lub tak
       Thread bouncing = new Thread(new Bouncing(circle));
*/

        Runnable bouncingAnimation = new Bouncing(circle);
        Thread bouncing = new Thread(bouncingAnimation);
       // bouncing.start();

//        circle.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//
//            }
//        });
        circle.setOnMouseClicked(event -> {
            if(!bouncing.isAlive()) // jak urochomiony nie uruchaniaj
            bouncing.start();
            else{
                counter ++;
                counterDisplay.setText("Licznik trafień: " + counter);
                System.out.println("Współrzędne myszy " + event.getX() + " "+ event.getY());
            }
        });
    }
}

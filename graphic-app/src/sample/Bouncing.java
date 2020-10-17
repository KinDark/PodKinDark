package sample;


import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;

public class Bouncing implements Runnable {

    private final Circle node;
    private final Scene scene;

    public Bouncing(Circle node) {
        this.node = node;
        this.scene = node.getParent().getScene();

    }

    @Override
    public void run() {
        double deltaX = 1;
        double deltaY = 1;
        while (true) {
            if (node.getCenterX() > scene.getWidth() - node.getRadius() && deltaX > 0) {
                deltaX = - deltaX;
            }
            if (node.getCenterX() < node.getRadius() && deltaX <0) {
                deltaX = - deltaX;
            }
            if (node.getCenterY() > scene.getHeight() - node.getRadius() && deltaY >0) {
                deltaY = - deltaY;
            }
            if (node.getCenterY() < node.getRadius() && deltaY <0) {
                deltaY = - deltaY;
            }
            final double dx = deltaX;
            final double dy = deltaY;
            Platform.runLater(() -> {
                node.setCenterX(node.getCenterX() + dx);
                node.setCenterY(node.getCenterY() + dy);
            });
//
//        int count = 0;
//        while (true) {
//          /*   Platform.runLater( // to wymusza zmianę współrzędnych w wątku UI - wątku obsługującym okno
//                   new Runnable() {
//                        //klasa anonomowa
//                        //definicja klasy bez nazwy implementującej interfejs Runnable
//                        @Override
//                        public void run() {
//                            node.setLayoutX(node.getLayoutX() + 1);
//                        }
//                  }); */
//                    //poniżej lambda jest odpowiednikiem klasy anonimowej powyżej
//            //
//            Platform.runLater(() -> node.setLayoutX(node.getLayoutX() + 1));
//            count++;

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//Java Assignment
//Filipe Nogueira Santos
//200534531

package com.example.assignmentcircle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AssignmentCircle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(50, Color.BLACK); //circle size and color
        circle.relocate(250, 250); //location of circle on screen, set to be centered based on screen size

        Pane pane = new Pane(circle); //circle set
        Scene scene = new Scene(pane, 600, 600); //set windows size
        stage.setScene(scene);
        stage.setTitle("Circle Assignment - 200534531"); // title
        stage.show();

        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) { // start of switch cases for movement on key presed
                case UP -> {
                    circle.setCenterY(circle.getCenterY() - 10); //-10 case click up, y
                    circle.setFill(Color.RED);
                }
                case DOWN -> {
                    circle.setCenterY(circle.getCenterY() + 10);//+10 case click down, y
                    circle.setFill(Color.BLUE);
                }
                case LEFT -> {
                    circle.setCenterX(circle.getCenterX() - 10); //-10 case cick left, x
                    circle.setFill(Color.YELLOW);
                }
                case RIGHT -> {
                    circle.setCenterX(circle.getCenterX() + 10); //-10 case click righ, x
                    circle.setFill(Color.GREEN);
                }
                case Z -> { // expand circle size with key 'Z'
                    if (circle.getRadius() < 200) { //if the radius is less than 200
                        circle.setRadius(circle.getRadius() + 10);
                    }
                }
                case X -> { // compress circle size with key 'x'
                    if (circle.getRadius() > 10) { // if the radius is more than 10
                        circle.setRadius(circle.getRadius() - 10);
                    }
                }
            }
        });
    }
}


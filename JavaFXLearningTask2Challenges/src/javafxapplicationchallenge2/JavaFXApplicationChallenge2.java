/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationchallenge2;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author James
 */
public class JavaFXApplicationChallenge2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Random randomGenerator = new Random();
        
        Group circles = new Group();
        Group rectangles = new Group();
        Group ellipses = new Group();
        
        for (int x = 0; x < 4; x++) {
            int xaxis = randomGenerator.nextInt(500);
            int yaxis = randomGenerator.nextInt(500);
            int radius = randomGenerator.nextInt(50);
            
            Circle circle = new Circle(xaxis, yaxis, radius);
            circle.setFill(Color.RED);
            circles.getChildren().add(circle);
        }
        
        for (int x = 0; x < 4; x++) {
            int xaxis = randomGenerator.nextInt(500);
            int yaxis = randomGenerator.nextInt(500);
            int width = randomGenerator.nextInt(50);
            int height = randomGenerator.nextInt(50);
            
            Rectangle rectangle = new Rectangle(xaxis, yaxis, width, height);
            rectangle.setFill(Color.BLUE);
            rectangles.getChildren().add(rectangle);
        }
        
                for (int x = 0; x < 4; x++) {
            int xaxis = randomGenerator.nextInt(500);
            int yaxis = randomGenerator.nextInt(500);
            int xradius = randomGenerator.nextInt(50);
            int yradius = randomGenerator.nextInt(50);
            
            Ellipse ellipse = new Ellipse(xaxis, yaxis, xradius, yradius);
            ellipse.setFill(Color.YELLOW);
            ellipses.getChildren().add(ellipse);
        }
        
        StackPane root = new StackPane();
        
        root.getChildren().add(circles);
        root.getChildren().add(rectangles);
        root.getChildren().add(ellipses);
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

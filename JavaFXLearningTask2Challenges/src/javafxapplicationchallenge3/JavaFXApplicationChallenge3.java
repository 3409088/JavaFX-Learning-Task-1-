/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationchallenge3;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author James
 */
public class JavaFXApplicationChallenge3 extends Application {
    
    Label label = new Label("");
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        MenuBar menuBar = new MenuBar();
        
        Menu file = new Menu("File");
        MenuItem newGame = new MenuItem("New Game");
        MenuItem loadGame = new MenuItem("Load Game");
        MenuItem exit = new MenuItem("Exit");
        
        file.getItems().addAll(newGame, loadGame, exit);
        
        menuBar.getMenus().addAll(file);
        
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        
        VBox buttons = new VBox();
        
        buttons.getChildren().add(button1);
        buttons.getChildren().add(button2);
        buttons.getChildren().add(button3);
        
        button1.setOnAction((ActionEvent event)-> {
            label.setText("Button 1");
        });
        
        button2.setOnAction((ActionEvent event)-> {
            label.setText("Button 2");
        });
        
        button3.setOnAction((ActionEvent event)-> {
            label.setText("Button 3");
        });
        
        root.setLeft(buttons);
        root.setTop(menuBar);
        root.setCenter(label);

        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Challenge 3");
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

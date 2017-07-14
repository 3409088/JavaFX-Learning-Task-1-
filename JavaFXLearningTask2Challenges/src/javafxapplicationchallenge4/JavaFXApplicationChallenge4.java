/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationchallenge4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author James
 */
public class JavaFXApplicationChallenge4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        CategoryAxis yAxis = new CategoryAxis();
        NumberAxis xAxis = new NumberAxis();
         
        yAxis.setLabel("Salesman");
        xAxis.setLabel("Cars Sold");
        
        BarChart<String, Number> barChart = new BarChart<>(yAxis, xAxis);
        
        XYChart.Series<String, Number> january = new XYChart.Series<>();
        XYChart.Series<String, Number> february = new XYChart.Series<>();
        XYChart.Series<String, Number> march = new XYChart.Series<>();
        
        january.setName("January");
        february.setName("February");
        march.setName("March");
        
        january.getData().add(new XYChart.Data<>("Jim", 10));
        january.getData().add(new XYChart.Data<>("Bob", 4));
        february.getData().add(new XYChart.Data<>("Jim", 14));
        february.getData().add(new XYChart.Data<>("Bob", 12));
        march.getData().add(new XYChart.Data<>("Jim", 9));
        march.getData().add(new XYChart.Data<>("Bob", 11));
        
        barChart.getData().add(january);
        barChart.getData().add(february);
        barChart.getData().add(march);
        
        BorderPane root = new BorderPane();
        
        root.setCenter(barChart);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Challenge 4");
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

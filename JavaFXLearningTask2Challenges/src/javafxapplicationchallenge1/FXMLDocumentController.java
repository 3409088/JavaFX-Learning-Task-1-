/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationchallenge1;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author James
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label labelAnswer;
    
    @FXML
    private Label labelQuestion;
    
    private String answers[] = new String[] {"Guaranteed", "Possible", "Unlikely", "Definitely Not"};
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(4);
        labelAnswer.setText(answers[randomInt]);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        labelQuestion.setText("Think of a question in your mind\nand press the button for an answer...");
    }    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.text.Text;


/**
 *
 * @author AnilC /w Eray
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Label label;
    @FXML private ComboBox<Text> WorkerType;
    @FXML private ComboBox<Text> LoginType; 
    @FXML private MenuButton LoginMenu;
    @FXML private Text Danisma,Hemsire,Lab, Admin;
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(WorkerType != null){
            WorkerType.getItems().removeAll(WorkerType.getItems());
            WorkerType.getItems().addAll(Danisma,Hemsire,Lab,Admin);
            WorkerType.getSelectionModel().select(Hemsire);
        }
        else if(LoginType != null){
            LoginType.getItems().removeAll(LoginType.getItems());
            LoginType.getItems().addAll(Danisma,Hemsire,Lab,Admin);
            LoginType.getSelectionModel().select(Hemsire);
        }
/*        if(LoginMenu != null){
            if(Login)
            ;
        }
*/
    }    
    
}

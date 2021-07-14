/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class ControladorEscena2 implements Initializable {

    @FXML
    private Label labelPrueba;
    @FXML
    private Button prueba;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    
    public void closeWindows() {
        
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/FXMLDocument.fxml"));
            
            
            Parent root = loader.load();
            
            ControladorInicio ci = loader.getController();
            
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            Stage myStage = (Stage) this.prueba.getScene().getWindow();
            myStage.close();
            
        }
        catch(IOException ioe){
            Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ioe);
            
        }
        
        
        
    }
    
}

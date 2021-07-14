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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class ControladorInicio implements Initializable {

    @FXML
    private Button btnEmpezar;

    
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cambiarEscena2(ActionEvent event) {
        
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Escena2.fxml"));
            
            Parent root = loader.load();
            
            ControladorEscena2 controladorE2 = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(e -> controladorE2.closeWindows());
            
            Stage myStage = (Stage) this.btnEmpezar.getScene().getWindow();
            myStage.close();
            
        }
        catch(IOException ioe){
            Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ioe);
            
        }
    }
    
    
    
}

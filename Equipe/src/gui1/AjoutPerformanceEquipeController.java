/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import service.PerformanceEquipeService;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class AjoutPerformanceEquipeController implements Initializable {

    @FXML
    private TextField id_victoires;
    @FXML
    private TextField id_defaites;
    @FXML
    private Label id_nuls;
    @FXML
    private Label id_but_marque;
    @FXML
    private Label id_but_encaisse;
    @FXML
    private Button btn_id;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouter(ActionEvent event) {
        PerformanceEquipeService us= new PerformanceEquipeService();
        
       
         if(Integer.parseInt(id_victoires.getText())<11 ||Integer.parseInt(id_victoires.getText())>40 ){
        id_victoires.setText("nombre choisi doit être entre [0 .. 40]");
        return;
        }else{id_victoires.setText("");}
         
        if(Integer.parseInt(id_defaites.getText())<0 ||Integer.parseInt(id_defaites.getText())>40 ){
        id_defaites.setText("nombre choisi doit être entre [0 .. 40]");
        return;
        }else{id_defaites.setText("");}
        
         if(Integer.parseInt(id_nuls.getText())<0 ||Integer.parseInt(id_nuls.getText())>40 ){
        id_nuls.setText("nombre choisi doit être entre [0 .. 40]");
        return;
        }else{id_nuls.setText("");}
         
         if(Integer.parseInt(id_but_marque.getText())<0 ||Integer.parseInt(id_but_marque.getText())>96 ){
        id_but_marque.setText("nombre choisi doit être entre [0 .. 96]");
        return;
        }else{id_but_marque.setText("");}
         
          if(Integer.parseInt(id_but_encaisse.getText())<0 ||Integer.parseInt(id_but_encaisse.getText())>96 ){
        id_but_encaisse.setText("nombre choisi doit être entre [0 .. 96]");
        return;
        }else{id_but_encaisse.setText("");}
        
       
    }
    
}

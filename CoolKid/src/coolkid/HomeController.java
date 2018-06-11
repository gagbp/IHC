/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coolkid;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author MP
 */
public class HomeController {
    @FXML
    private void Voltar(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Inicial.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }    
    }
    
    @FXML
    private void AddTarefa(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cadastro_Tarefa.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }    
    }
    
    @FXML
    private void AddFilho(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cadastro_Crianca.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }    
    }
    @FXML
    private void VerificarTarefa(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Verificar_Tarefas.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }    
    }
}

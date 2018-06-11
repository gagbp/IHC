/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coolkid;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import coolkid.CoolKid;

/**
 *
 * @author MP
 */
public class InicialController implements Initializable {
    
    private Scene cena;
    
    @FXML
    private void Cadastro(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cadastro_Rep.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }    
    }
    
    @FXML
    private void EsqueceuSenha(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Esqueceu_Senha.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }    
    }
    
    @FXML
    private void LoginCrianca(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login_Crianca.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
            
        }catch (IOException io){
            io.printStackTrace();
        }    
    }
    
    @FXML
    private void Entrar(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

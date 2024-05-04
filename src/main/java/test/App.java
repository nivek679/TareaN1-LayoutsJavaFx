package test;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage pantallaPrincipal){
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/layouts/pruebaJavaFXvista.fxml"));
        Parent root = loader.load();    
        Scene scene =  new Scene(root);
        pantallaPrincipal.setScene(scene);
        pantallaPrincipal.show();
         } catch (IOException e) {
        // Manejar la excepción IOException
        e.printStackTrace();
        // O mostrar un mensaje de error al usuario, por ejemplo:
        // System.out.println("Error al cargar la vista FXML: " + e.getMessage());
        }
    } 

    public static void main(String[] args) {
        launch(args);
    }
    
}

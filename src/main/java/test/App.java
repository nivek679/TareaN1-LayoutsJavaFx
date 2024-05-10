package test;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage pantallaPrincipal){
        AnchorPane root = new AnchorPane();
        
        HBox contenedorPrincipal = new HBox();
        VBox contenedorSChats = new VBox();
        HBox contenedorPerfil = new HBox();
        VBox contenedorSnodos = new VBox();
        ListView<String> mensajes_recibidos= new ListView<>();
        TextField mensajeIngresado = new TextField();
        Label nombrePerfilUsuario = new Label("Juan lopez");
        ImageView imageView = new ImageView();
        Image image = new Image("/resources/img/ImagenProfile.png");
        imageView.setImage(image);

        root.setTopAnchor(contenedorPrincipal, 0.0);
        root.setBottomAnchor(contenedorPrincipal, 0.0);
        root.setLeftAnchor(contenedorPrincipal, 0.0);
        root.setRightAnchor(contenedorPrincipal, 0.0);

        
        contenedorPrincipal.getChildren().addAll(contenedorSChats, contenedorSnodos);
        contenedorSChats.getChildren().add(contenedorPerfil);
        contenedorPerfil.getChildren().addAll(imageView, nombrePerfilUsuario);
        contenedorSnodos.getChildren().addAll(mensajes_recibidos, mensajeIngresado);
        root.getChildren().add(contenedorPrincipal);

        
        
        
        
        
        

        Scene scene = new Scene(root);
        pantallaPrincipal.setTitle("Whatsapp");
        pantallaPrincipal.setScene(scene);
        pantallaPrincipal.show();

    } 

    public static void main(String[] args) {
        launch(args);
    }
    
}

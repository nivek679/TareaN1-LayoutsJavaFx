package test;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
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
        imageView.setFitWidth(50); // Ancho máximo deseado
        imageView.setPreserveRatio(true); // Mantener la relación de aspecto de la imagen

        StackPane imageViewContainer = new StackPane(imageView);
        imageViewContainer.setMaxWidth(10);    
        imageViewContainer.setMaxHeight(40);

        imageViewContainer.setPadding(new Insets(10));
        contenedorSChats.setPadding(new Insets(10));
        contenedorSnodos.setPadding(new Insets(10));
        contenedorSnodos.setSpacing(10);
        contenedorPerfil.setPadding(new Insets(10));
        //mensajes_recibidos.setPadding(new Insets(10));
        //mensajeIngresado.setPadding(new Insets(10));
        nombrePerfilUsuario.setPadding(new Insets(10)); 


        
        root.setTopAnchor(contenedorPrincipal, 0.0);
        root.setBottomAnchor(contenedorPrincipal, 0.0);
        root.setLeftAnchor(contenedorPrincipal, 0.0);
        root.setRightAnchor(contenedorPrincipal, 0.0);

        
        contenedorPrincipal.getChildren().addAll(contenedorSChats, contenedorSnodos);
        contenedorSChats.getChildren().add(contenedorPerfil);
        contenedorPerfil.getChildren().addAll(imageViewContainer, nombrePerfilUsuario);
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

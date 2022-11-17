package Vista;

import Controlador.Tienda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPrincipal {

    /**
     *
     * @Author Gabriel José Guzmán Leiva
     *
     */

    @FXML
    private Button botonAnadirCamisaCatalogo;

    @FXML
    private Button botonCliente;

    @FXML
    private Button botonCatalogo;

    @FXML
    private Button botonCamisa;

    @FXML
    private Button listarCliente;

    @FXML
    private  Button listarCatalogo;

    @FXML
    private Button listarCamisa;

    @FXML
    private void abrirVentanaClientes (ActionEvent event){


        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("RegistrarCliente.fxml"));
            Parent root = loader.load();

            RegistroCliente controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindows());

            Stage myStage = (Stage) this.botonCliente.getScene().getWindow();
            myStage.close();

        }catch (IOException e){

            throw new RuntimeException(e);

        }
    }

    @FXML
    private void abrirVentanaAnadirCamisa(){

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("AnadirCamisaCatalogo.fxml"));
            Parent root = loader.load();

            AnadirCamisaCatalogo controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindows());

            Stage myStage = (Stage) this.botonAnadirCamisaCatalogo.getScene().getWindow();
            myStage.close();

        }catch (IOException e){

            throw new RuntimeException(e);

        }

    }

    @FXML
    private void abrirVentanaCatalogo(ActionEvent event){

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("RegistrarCatalogo.fxml"));
            Parent root = loader.load();

            RegistrarCatalogo controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindows());

            Stage myStage = (Stage) this.botonCatalogo.getScene().getWindow();
            myStage.close();

        }catch (IOException e){

            throw new RuntimeException(e);

        }
    }

    @FXML
    private void abrirVentanaCamiseta(ActionEvent event){

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("RegistrarCamiseta.fxml"));
            Parent root = loader.load();

            RegistrarCamisa controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controlador.closeWindows());

            Stage myStage = (Stage) this.botonCamisa.getScene().getWindow();
            myStage.close();

        }catch (IOException e){

            throw new RuntimeException(e);

        }
    }

    @FXML
    private void ListarCamisa(){

        for (int i = 0; i < Tienda.poolCamisa.size(); i++) {

            System.out.println(Tienda.poolCamisa.get(i) + "\n");
        }

    }

    @FXML
    private void listarClientes (){

        for (int i = 0; i < Tienda.poolClientes.size(); i++) {

            System.out.println(Tienda.poolClientes.get(i) + "\n");
        }

    }

    @FXML
    private void listarCatalogos(){

        for (int i = 0; i < Tienda.poolCatalogos.size(); i++) {

            System.out.println(Tienda.poolCatalogos.get(i) + "\n");
        }

    }

}//Fin programa

package Vista;

import Controlador.Tienda;
import Vista.MenuPrincipal;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 * @Author Gabriel José Guzmán Leiva
 *
 */

public class RegistroCliente {

    @FXML
    private Button botonRegistrarCliente;

    @FXML
    private TextField cedulaRC;

    @FXML
    private TextField nombreRC;

    @FXML
    private TextField primerApellidoRC;

    @FXML
    private TextField segundoApellidoRC;

    @FXML
    private TextField correoElectronicoRC;

    @FXML
    private TextField direccionRC;

    @FXML
    public void closeWindows(){

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPrincipal.fxml"));

            Parent root = loader.load();

            MenuPrincipal controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.botonRegistrarCliente.getScene().getWindow();
            myStage.close();

        }catch (IOException e){

            throw new RuntimeException(e);

        }
    }
    @FXML
    public void agregarCliente(){

        String idCliente = this.cedulaRC.getText();

        String nombreCliente = this.nombreRC.getText();

        String primerApellidoCliente = this.primerApellidoRC.getText();

        String segundoApellidoCliente = this.segundoApellidoRC.getText();

        String correoElectronicoCliente = this.correoElectronicoRC.getText();

        String direccionCliente = this.direccionRC.getText();

        Tienda.crearCliente(idCliente, nombreCliente, primerApellidoCliente, segundoApellidoCliente, correoElectronicoCliente, direccionCliente);

    }



}


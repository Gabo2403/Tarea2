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

public class RegistrarCatalogo {

    @FXML
    private Button registrarCatalogo;

    @FXML
    private TextField fechaCreacionRC;

    @FXML
    private TextField nombreCatalogoRC;

    @FXML
    private TextField mesRC;

    @FXML
    private TextField anioRC;

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

            Stage myStage = (Stage) this.registrarCatalogo.getScene().getWindow();
            myStage.close();

        }catch (IOException e){

            throw new RuntimeException(e);

        }
    }

    @FXML
    public void agregarCatalogo(){

        String fechaCreacion = this.fechaCreacionRC.getText();

        String nombreCatalogo = this.nombreCatalogoRC.getText();

        String mes = this.mesRC.getText();

        int anio = Integer.parseInt(this.anioRC.getText());

        Tienda.crearCatalogo(fechaCreacion, nombreCatalogo, mes, anio);

    }



}

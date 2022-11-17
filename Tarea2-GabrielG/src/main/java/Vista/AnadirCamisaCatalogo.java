package Vista;

import Controlador.Tienda;
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
 */

public class AnadirCamisaCatalogo {

    @FXML
    private Button anadirCamisaCatalogo;

    @FXML
    private TextField idCamisa;

    @FXML
    private TextField nombreCatalogo;

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

            Stage myStage = (Stage) this.anadirCamisaCatalogo.getScene().getWindow();
            myStage.close();

        }catch (IOException e){

            throw new RuntimeException(e);

        }
    }

    @FXML
    public void agregarCamisaCatalogo(){

        int idCamisa = Integer.parseInt(this.idCamisa.getText());

        String nombreCatalogo = this.nombreCatalogo.getText();

        Tienda.agregarCamisaCatalogo(idCamisa, nombreCatalogo);

        System.out.println(Tienda.poolCatalogos);
    }
}

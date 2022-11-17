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

public class RegistrarCamisa {

    /**
     *
     * @Author Gabriel José Guzmán Leiva
     *
     */

    @FXML
    private Button registrarCamisa;

    @FXML
    private TextField colorRC;

    @FXML
    private TextField tallaCamisetaRC;

    @FXML
    private TextField despripcionRC;

    @FXML
    private TextField imagenRC;

    @FXML
    private TextField preciosRC;

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

            Stage myStage = (Stage) this.registrarCamisa.getScene().getWindow();
            myStage.close();

        }catch (IOException e){

            throw new RuntimeException(e);

        }
    }

    @FXML
    public void agregarCamisa(){

        String color = this.colorRC.getText();

        char tallaCamiseta = this.tallaCamisetaRC.getText().charAt(0);

        String descripcion = this.despripcionRC.getText();

        String imagen = this.imagenRC.getText();

        double precio = Double.parseDouble(this.preciosRC.getText());

        Tienda.crearCamisa(color, tallaCamiseta, descripcion, imagen, precio);
    }




}

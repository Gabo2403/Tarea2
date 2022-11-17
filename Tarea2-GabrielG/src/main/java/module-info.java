module com.tarea2gabrielg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tarea2gabrielg to javafx.fxml;
    exports com.tarea2gabrielg;
}
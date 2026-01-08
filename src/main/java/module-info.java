module aplicacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens aplicacion to javafx.graphics, javafx.fxml;
    opens aplicacion.circulo to javafx.fxml;
}
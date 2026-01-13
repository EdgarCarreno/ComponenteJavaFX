import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import org.testfx.framework.junit5.ApplicationTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.testfx.api.FxAssert.verifyThat;

// clase que comprueba la utilizacion del componente
// hereda de ApplicationTest para autamatizar el test
public class ControlTest extends ApplicationTest
{
    // carga el archivo XML donde se encuentra el componente
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = FXMLLoader.load(getClass().getResource("/aplicacion/testComponente.fxml"));
        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.show();
    }

    // test para verificar el cambio de color
    @Test
    public void cambiarColorAzul()
    {
        clickOn("#rb_azul"); // simula la interacción del usuario
        Circle circulo = lookup("#circulo").queryAs(Circle.class); // busca al componente dentro de la escena y luego le confirma a Java que es un círculo
        verifyThat(circulo.getFill(), is(Paint.valueOf("5721ff"))); // valida que el color de relleno coincida con el valor asignado
    }

    // test para verificar el cambio de color
    @Test
    public void cambiarColorVerde()
    {
        clickOn("#rb_verde"); // simula la interacción del usuario
        Circle circulo = lookup("#circulo").queryAs(Circle.class); // busca al componente dentro de la escena y luego le confirma a Java que es un círculo
        verifyThat(circulo.getFill(), is(Paint.valueOf("31ff21"))); // valida que el color de relleno coincida con el valor asignado
    }

    // test para verificar el cambio de color
    @Test
    public void cambiarColorRojo()
    {
        clickOn("#rb_rojo"); // simula la interacción del usuario
        Circle circulo = lookup("#circulo").queryAs(Circle.class); // busca al componente dentro de la escena y luego le confirma a Java que es un círculo
        verifyThat(circulo.getFill(), is(Paint.valueOf("ff321"))); // valida que el color de relleno coincida con el valor asignado
    }
}


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

public class ControlTest extends ApplicationTest
{

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = FXMLLoader.load(getClass().getResource("/aplicacion/testComponente.fxml"));
        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.show();
    }

    @Test
    public void cambiarColorAzul()
    {

        clickOn("#rb_azul");
        Circle circulo = lookup("#circulo").queryAs(Circle.class);
        verifyThat(circulo.getFill(), is(Paint.valueOf("5721ff")));
    }

    @Test
    public void cambiarColorVerde()
    {
        clickOn("#rb_verde");
        Circle circulo = lookup("#circulo").queryAs(Circle.class);
        verifyThat(circulo.getFill(), is(Paint.valueOf("31ff21")));
    }

    @Test
    public void cambiarColorRojo()
    {
        clickOn("#rb_rojo");
        Circle circulo = lookup("#circulo").queryAs(Circle.class);
        verifyThat(circulo.getFill(), is(Paint.valueOf("ff321")));
    }
}

package aplicacion.circulo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;


public class CirculoController {
	@FXML
    private Circle circulo;

    @FXML
    private ToggleGroup colores;

    @FXML
    private RadioButton rb_azul;

    @FXML
    private RadioButton rb_verde;

    @FXML
    private RadioButton rb_rojo;

    @FXML
    void color_circle(ActionEvent event)
    {
    	Paint pintura;

    	if (rb_azul.isSelected())
        {
    		pintura = Paint.valueOf("5721ff");
    	}
        else if (rb_verde.isSelected())
        {
    		pintura = Paint.valueOf("31ff21");
		}
        else if (rb_rojo.isSelected())
        {
			pintura = Paint.valueOf("ff3f21");
		}
        else
        {
			pintura = Paint.valueOf("ebff1f");
		}
    	circulo.setFill(pintura);
    	circulo.fireEvent(new EventoCambioColor(pintura));
    	
    }
}

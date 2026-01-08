package aplicacion.circulo;
	
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


public class Circulo extends Pane {
	
	private CirculoController controlador = new CirculoController();
	
	public Circulo() {
		try {
			FXMLLoader loader = new FXMLLoader();

            loader.setRoot(this);
			loader.setController(this.controlador);
			loader.setLocation(getClass().getResource("/aplicacion/circulo/Circulo.fxml"));
			loader.load();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

package dad.primertristre.byr;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controller byrController;

	public void start(Stage primaryStage) throws Exception {
		byrController = new Controller();
		
		Scene scene = new Scene(byrController.getView(), 640, 480);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}

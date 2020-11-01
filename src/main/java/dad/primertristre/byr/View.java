package dad.primertristre.byr;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;


public class View  extends GridPane{
	TextField buscarText;
	TextField reemplazarText;
	CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
	Button buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton;
	VBox vboxnaranja;
	GridPane gridamarillo;
	GridPane gridverde;
	public View() {
		super();
		// Campos de Texto
		buscarText = new TextField();
		reemplazarText = new TextField();
		//checkbox
		checkBox1 = new CheckBox("Mayúsculas y minúsculas");
		checkBox2 = new CheckBox("Buscar hacia atrás");
		checkBox3 = new CheckBox("Expresión regular");
		checkBox4 = new CheckBox("Resaltar resultados");
		//Grid amarillo ejemplo
		gridamarillo = new GridPane();
		gridamarillo.add(checkBox1, 0, 0);
		gridamarillo.add(checkBox2, 0, 1);
		gridamarillo.add(checkBox3, 1, 0);
		gridamarillo.add(checkBox4, 1, 1);
		gridamarillo.setHgap(4);
		gridamarillo.setVgap(4);
		//Grid verde ejemplo
		gridverde = new GridPane();
		gridverde.addRow(0, new Label("Buscar:"), buscarText);
		gridverde.addRow(1, new Label("Reemplazar con:"), reemplazarText);
		gridverde.add(gridamarillo, 1, 2);
		//botones
		buscarButton = new Button("Buscar");
		reemplazarButton = new Button("Reemplazar");
		reemplazarTodoButton = new Button("Reemplazar Todo");
		cerrarButton = new Button("Cerrar");
		ayudaButton = new Button("Ayuda");
		buscarButton.setMinWidth(100);
		reemplazarButton.setMinWidth(100);
		reemplazarTodoButton.setMinWidth(100);
		cerrarButton.setMinWidth(100);
		ayudaButton.setMinWidth(100);
		//box naranja
		vboxnaranja = new VBox();
		vboxnaranja.getChildren().addAll(buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton);
		vboxnaranja.setAlignment(Pos.CENTER);
		vboxnaranja.setSpacing(4);
		
		setPadding(new Insets(4));
		setHgap(4);
		setVgap(4);
		addRow(0, gridverde, vboxnaranja);
		setAlignment(Pos.TOP_LEFT);
		ColumnConstraints[] columns = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints()};

		getColumnConstraints().setAll(columns);
		columns[0].setHalignment(HPos.RIGHT);
		columns[1].setHgrow(Priority.NEVER);
		columns[1].setFillWidth(true);

	}
}

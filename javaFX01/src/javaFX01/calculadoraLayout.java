package javaFX01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class calculadoraLayout extends Application {

	@Override
	public void start(Stage stage) {
		GridPane painel = new GridPane();
		Scene scn = new Scene(painel);
		painel.setHgap(15);
		painel.setVgap(15);
		
	
		TextField campo1 = new TextField("");
		painel.add(campo1, 1, 1,3, 1);
		campo1.setPrefSize(100, 10);
		Button btn = new Button("  CE  ");
		painel.add(btn, 4, 1);
		Button btn1 = new Button("   1   ");
		painel.add(btn1,1,2);
		Button btn2 = new Button("   2   ");
		painel.add(btn2,2,2);
		Button btn3 = new Button("   3   ");
		painel.add(btn3,3,2);
		Button btnplus = new Button("   +   ");
		painel.add(btnplus,4,2);
		Button btn4 = new Button("   4   ");
		painel.add(btn4,1,3);
		Button btn5 = new Button("   5   ");
		painel.add(btn5,2,3);
		Button btn6 = new Button("   6   ");
		painel.add(btn6,3,3);
		Button btnmin = new Button("   -   ");
		painel.add(btnmin,4,3);
		Button btn7 = new Button("   7   ");
		painel.add(btn7,1,4);
		Button btn8 = new Button("   8   ");
		painel.add(btn8,2,4);
		Button btn9 = new Button("   9   ");
		painel.add(btn9,3,4);
		Button btnmul = new Button("   *   ");
		painel.add(btnmul,4,4);
		Button btnvir = new Button("   ,   ");
		painel.add(btnvir,1,5);
		Button btn0 = new Button("   0   ");
		painel.add(btn0,2,5);
		Button btnequal = new Button("   =   ");
		painel.add(btnequal,3,5);
		Button btndiv = new Button("   /   ");
		painel.add(btndiv,4,5);
		stage.setScene(scn);
		stage.setTitle("Calculadora");
		stage.show();

	}

	public static void main(String[] args) {
		Application.launch(calculadoraLayout.class, args);

	}
}

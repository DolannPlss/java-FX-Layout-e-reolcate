package javaFX01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Calculadora extends Application {

	@Override
	public void start(Stage stage) {
		Pane painel = new Pane();
		Scene scn = new Scene(painel);
		
		TextField campo1 = new TextField("0");
		campo1.relocate(10.0,10.0);
		painel.getChildren().add(campo1);
		Button btn = new Button ("  CE  ");
		btn.relocate(160.0,10.0);
		painel.getChildren().add(btn);
		Button btn1 = new Button ("   1   ");
		btn1.relocate(10.0,40.0);
		painel.getChildren().add(btn1);
		Button btn2 = new Button ("   2   ");
		btn2.relocate(60.0,40.0);
		painel.getChildren().add(btn2);
		Button btn3 = new Button ("   3   ");
		btn3.relocate(110.0,40.0);
		painel.getChildren().add(btn3);
		Button btnplus = new Button ("   +   ");
		btnplus.relocate(160.0,40.0);
		painel.getChildren().add(btnplus);
		Button btn4 = new Button ("   4   ");
		btn4.relocate(10.0,70.0);
		painel.getChildren().add(btn4);
		Button btn5 = new Button ("   5   ");
		btn5.relocate(60.0,70.0);
		painel.getChildren().add(btn5);
		Button btn6 = new Button ("   6   ");
		btn6.relocate(110.0,70.0);
		painel.getChildren().add(btn6);
		Button btnmin = new Button ("   -   ");
		btnmin.relocate(160.0,70.0);
		painel.getChildren().add(btnmin);
		Button btn7 = new Button ("   7   ");
		btn7.relocate(10.0,100.0);
		painel.getChildren().add(btn7);
		Button btn8 = new Button ("   8   ");
		btn8.relocate(60.0,100.0);
		painel.getChildren().add(btn8);
		Button btn9 = new Button ("   9   ");
		btn9.relocate(110.0,100.0);
		painel.getChildren().add(btn9);
		Button btnmul = new Button ("   *   ");
		btnmul.relocate(160.0,100.0);
		painel.getChildren().add(btnmul);
		Button btnvir = new Button ("   ,   ");
		btnvir.relocate(10.0,130.0);
		painel.getChildren().add(btnvir);
		Button btn0 = new Button ("   0   ");
		btn0.relocate(60.0,130.0);
		painel.getChildren().add(btn0);
		Button btnequal = new Button ("   =   ");
		btnequal.relocate(110.0,130.0);
		painel.getChildren().add(btnequal);
		Button btndiv = new Button ("   /   ");
		btndiv.relocate(160.0,130.0);
		painel.getChildren().add(btndiv);
		
		
		
		
		stage.setScene(scn);
		stage.setTitle("Calculadora");
		stage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(Calculadora.class, args);

	}
}


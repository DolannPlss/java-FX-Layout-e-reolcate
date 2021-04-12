package javaFX01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class formularioLayout extends Application {
	public void start(Stage stage) {
		GridPane painel = new GridPane();
		Scene scn = new Scene(painel, 560, 190);
		
		painel.setHgap(15);
		painel.setVgap(15);
		Label lblTextoId = new Label ("id");
		painel.add(lblTextoId,1,1);
		Label lblTextoNome = new Label ("Nome");
		painel.add(lblTextoNome,1,2);
		Label lblTextoTele = new Label ("Telefone");
		painel.add(lblTextoTele,1,3);
		Button btn = new Button ("salvar");
		painel.add(btn,1,4);
		Button btn2 = new Button ("pesquisar");
		painel.add(btn2,2,4);
		TextField campo1 = new TextField("");
		campo1.setPrefSize(400, 10);
		painel.add(campo1,2,1);
		TextField campo2 = new TextField("");
		campo2.setPrefSize(400, 10);
		painel.add(campo2,2,2);
		TextField campo3 = new TextField("");
		campo3.setPrefSize(400, 10);
		painel.add(campo3,2,3);
		
		stage.setScene(scn);
		stage.setTitle("Formulario de contrato");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(formularioLayout.class, args);

	}
}
package javaFX01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class formularioCoordenadaFixa extends Application {

	@Override
	public void start(Stage stage) {
		Pane painel = new Pane();
		Scene scn = new Scene(painel,560, 190);
		
		Label lblTextoId = new Label ("id");
		lblTextoId.relocate(10.0,30.0);
		painel.getChildren().add(lblTextoId);
		Label lblTextoNome = new Label ("Nome");
		lblTextoNome.relocate(10.0,70.0);
		painel.getChildren().add(lblTextoNome);
		Label lblTextoTele = new Label ("Telefone");
		lblTextoTele.relocate(10.0,110.0);
		painel.getChildren().add(lblTextoTele);
		Button btn = new Button ("salvar");
		btn.relocate(10.0,150.0);
		painel.getChildren().add(btn);
		Button btn2 = new Button ("pesquisar");
		btn2.relocate(60.0,150.0);
		painel.getChildren().add(btn2);
		TextField campo1 = new TextField("");
		campo1.relocate(150.0,30.0);
		campo1.setPrefSize(400, 10);
		painel.getChildren().add(campo1);
		TextField campo2 = new TextField("");
		campo2.relocate(150.0,70.0);
		campo2.setPrefSize(400, 10);
		painel.getChildren().add(campo2);
		TextField campo3 = new TextField("");
		campo3.relocate(150.0,110.0);
		campo3.setPrefSize(400, 10);
		painel.getChildren().add(campo3);
		
		
		stage.setScene(scn);
		stage.setTitle("Formulario de contrato");
		stage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(formularioCoordenadaFixa.class, args);

	}
}

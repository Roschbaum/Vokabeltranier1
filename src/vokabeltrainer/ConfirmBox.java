package vokabeltrainer;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox{

	private static Boolean antwort;
	public static boolean anzeigen(){
		Stage secundaryStage = new Stage();
		secundaryStage.setTitle("Wiedersehen");
		secundaryStage.setOnCloseRequest(e -> e.consume());
		secundaryStage.initModality(Modality.APPLICATION_MODAL);
		//Ja-Button
		Button yesButton = new Button("Ja   ");
		yesButton.setOnAction(e -> {
			antwort = true;
			secundaryStage.close();
		});
		//Nein-Button
		Button noButton = new Button("Nein");
		noButton.setOnAction(e -> {
			antwort = false;
			secundaryStage.close();
		});
		Label label = new Label("Wollen sie das Programm wirklich beenden?");
	
		//Nebenlayout, dass Ja- und Neinbutton in das Hauptlayout einfügen. Rein aus Optik.
		HBox layout2 = new HBox();
		HBox.setHgrow(yesButton, Priority.ALWAYS);
	    HBox.setHgrow(noButton, Priority.ALWAYS);
	    yesButton.setMaxWidth(Double.MAX_VALUE);
	    noButton.setMaxWidth(Double.MAX_VALUE);
	    layout2.getChildren().addAll(noButton, yesButton);
		
	    //Hauptlayout
	    GridPane layout = new GridPane();
	    GridPane.setConstraints(label,0,0);
		GridPane.setConstraints(layout2,0,1);layout.setPadding(new Insets(25, 25, 25, 25));
		layout.setHgap(10);
		layout.setVgap(10);
		layout.getChildren().addAll(label,layout2);
		
		Scene scene = new Scene(layout,325,100);
		secundaryStage.setScene(scene);
		secundaryStage.showAndWait();
		return (antwort);
	}
}


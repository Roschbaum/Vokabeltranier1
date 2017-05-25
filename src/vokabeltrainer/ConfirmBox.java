package vokabeltrainer;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {

    private static Boolean antwort;

    public static boolean anzeigen() {
        Stage secundaryStage = new Stage();
        secundaryStage.initModality(Modality.APPLICATION_MODAL);
        Button yesButton = new Button("Ja   ");
        yesButton.setOnAction(e -> {
            antwort = true;
            secundaryStage.close();
        });
        Button noButton = new Button("Nein");
        noButton.setOnAction(e -> {
            antwort = false;
            secundaryStage.close();
        });
        Label label = new Label("Wollen sie das Programm wirklich beenden?");

        VBox layout = new VBox();
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 300, 300);
        secundaryStage.setScene(scene);
        secundaryStage.showAndWait();
        return (antwort);
    }
}

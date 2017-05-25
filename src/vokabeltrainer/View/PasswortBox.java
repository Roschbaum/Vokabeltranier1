package vokabeltrainer.View;

import java.io.Serializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PasswortBox implements Serializable {

    public static void anzeigen() {
        //Stage wird erstellt
        Stage secundaryStage = new Stage();
        secundaryStage.setTitle("Willkommen");
        secundaryStage.initModality(Modality.APPLICATION_MODAL);
        secundaryStage.setOnCloseRequest(e -> e.consume());
        //Benutzername
        Label benutzernameLabel = new Label("Benutzername:");
        benutzernameLabel.setStyle("-fx-text-fill: white;");
        GridPane.setConstraints(benutzernameLabel, 0, 0);
        TextField benutzernameTextfield = new TextField();
        benutzernameTextfield.setPromptText("benutzername");
        GridPane.setConstraints(benutzernameTextfield, 1, 0);
        //Passwort
        Label passwortLabel = new Label("Passwort:");
        passwortLabel.setStyle("-fx-text-fill: white;");
        GridPane.setConstraints(passwortLabel, 0, 1);
        PasswordField passwortTextfield = new PasswordField();
        passwortTextfield.setPromptText("passwort");
        GridPane.setConstraints(passwortTextfield, 1, 1);
        //Abbrechen-Button
        Button abbrechen = new Button("Abbrechen");
        abbrechen.setOnAction(e -> {
            System.exit(0);
        });
        //Login-Button
        Button login = new Button("Login");
        login.setOnAction(e -> {
            String benutzernameString = new String("Manuel Eberts");
            String benutzername = benutzernameTextfield.getText();
            String passwortString = new String("Passwort123");
            String password = passwortTextfield.getText();
            if (benutzername.equals(benutzernameString)) {
                if (password.equals(passwortString)) {
                    secundaryStage.close();
                } else {
                    System.out.println("Falsches Passwort!");
                    System.out.println(passwortTextfield.getText());
                }
            }
        });

        //Es wird ein neues Hauptlayout erstellt, dass in Reihen und Spalten aufgeteilt ist.
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(10);
        layout.setHgap(10);
        /*Es wird ein Unterlayout erstellt, in dem der Login- und der Abbrechenbutton 
		*positioniert werden. Dieses Layout wird dann in der dritten Reihe und der zweiten
		*Spalte des Hauptlayouts positioniert.
         */
        HBox layout2 = new HBox();
        HBox.setHgrow(login, Priority.ALWAYS);
        HBox.setHgrow(abbrechen, Priority.ALWAYS);
        login.setMaxWidth(Double.MAX_VALUE);
        abbrechen.setMaxWidth(Double.MAX_VALUE);
        layout2.getChildren().addAll(login, abbrechen);
        GridPane.setConstraints(layout2, 1, 2);

        layout.getColumnConstraints().add(new ColumnConstraints(100));
        layout.getColumnConstraints().add(new ColumnConstraints(200));
        layout.getChildren().addAll(benutzernameLabel, benutzernameTextfield, passwortLabel, passwortTextfield, layout2);
        layout.setStyle("-fx-background-color: #336699;");

        Scene scene = new Scene(layout, 350, 125);
        secundaryStage.setScene(scene);
        secundaryStage.showAndWait();
    }
}

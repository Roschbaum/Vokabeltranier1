package vokabeltrainer;

import java.io.Serializable;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class ViewVokTrainer extends Application implements Serializable{

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            applicationBeenden();
        });
        applicationAnmelden();

        //Statistiken
        GridPane statistikenLayout = new GridPane();
        Scene statistikScene = new Scene(statistikenLayout, 0, 0);
        Button statistikButton = new Button("Statistiken");
        statistikButton.setOnAction(e -> primaryStage.setScene(statistikScene));

        HBox layout1 = new HBox();
        HBox.setHgrow(statistikButton, Priority.ALWAYS);
        statistikButton.setMaxWidth(Double.MAX_VALUE);
        layout1.getChildren().addAll(statistikButton);
        layout1.setStyle("-fx-background-image:url('file:///Users/MANU/Google%20Drive/Vokabeltrainer/src/image/1920x1080.jpg');");
        Scene scene = new Scene(layout1, 1000, 1000);
        Button showScene = new Button("Back <-");
        showScene.setOnAction(e -> primaryStage.setScene(scene));
        GridPane.setConstraints(showScene, 0, 0);
        statistikenLayout.getChildren().add(showScene);

        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    public void applicationBeenden() {
        Boolean antwort = ConfirmBox.anzeigen();
        if (antwort) {
            System.exit(0);
        }
    }

    public void applicationAnmelden() {
        PasswortBox.anzeigen();
    }
}

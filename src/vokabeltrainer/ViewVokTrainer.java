package vokabeltrainer;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ViewVokTrainer extends Application
{ 	
	public static void main(String[] args){
		launch(args);
	}
	
    public void start(Stage primaryStage) throws Exception{
    		primaryStage.setOnCloseRequest(e->{
    			e.consume();
    			applicationBeenden();
    		});
		StackPane layout = new StackPane();
		Scene scene = new Scene(layout, 500, 100);
		primaryStage.setTitle("Vokabeltrainer");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    
    public void applicationBeenden(){
    		Boolean antwort = ConfirmBox.anzeigen();
    		if(antwort){
    			Platform.exit();
    		}
    }
}
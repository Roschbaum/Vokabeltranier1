import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ViewVokTrainer extends Application
{ 	
	public static void main(String[] args){
		launch(args);
	}
	Button button1;
	Button button2;
    public void start(Stage primaryStage) throws Exception{
    	
    	primaryStage.setOnCloseRequest(e->{
    			e.consume();
    			applicationBeenden();
    		});
    	applicationAnmelden();
    	
    	button1	= new Button("GoToScene2");
    	button2	= new Button("GoToScene1");
    	
		StackPane layout1 = new StackPane();
		layout1.getChildren().add(button1);
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		Scene scene1 = new Scene(layout1, 1000, 1000);
		Scene scene2 = new Scene(layout2, 1000, 1000);
		button2.setOnAction(e->primaryStage.setScene(scene1));
		button1.setOnAction(e->primaryStage.setScene(scene2));
		primaryStage.setTitle("Vokabeltrainer");
		primaryStage.setScene(scene1);
		primaryStage.show();
    }
    
    public void applicationBeenden(){
    	Boolean antwort = ConfirmBox.anzeigen();
   		if(antwort){
   			System.exit(0);
   		}
    }
    
    public void applicationAnmelden(){
    	PasswortBox.anzeigen();
    }
}
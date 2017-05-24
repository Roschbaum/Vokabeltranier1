package vokabeltrainer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
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
    	applicationAnmelden();
		//MenubarTest
        /*MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");

        MenuItem menuItem = new MenuItem("Open");
        menuItem.setGraphic(new ImageView(new Image("flower.png")));
        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
        */
        Image image = new Image("file:///Users/MANU/Google%20Drive/Vokabeltrainer/src/image/1920x1080.jpg");
        ImageView imageView = new ImageView(image);

        HBox hbox = new HBox(imageView);

        Scene scene = new Scene(hbox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
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

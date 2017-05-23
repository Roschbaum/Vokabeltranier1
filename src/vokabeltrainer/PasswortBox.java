import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PasswortBox {
	public static void anzeigen(){
		Stage secundaryStage = new Stage();
		secundaryStage.setTitle("Willkommen");
		secundaryStage.initModality(Modality.APPLICATION_MODAL);
		secundaryStage.setOnCloseRequest(e -> e.consume());
		
		GridPane layout = new GridPane();
		layout.setPadding(new Insets(10,10,10,10));
		layout.setVgap(10);
		layout.setHgap(10);
		
		Label benutzernameLabel = new Label("Benutzername:");
		GridPane.setConstraints(benutzernameLabel, 0, 0);
		TextField benutzernameTextfield = new TextField();
		benutzernameTextfield.setPromptText("benutzername");
		GridPane.setConstraints(benutzernameTextfield, 1, 0);
		
		Label passwortLabel = new Label("Passwort:");
		GridPane.setConstraints(passwortLabel, 0, 1);
		TextField passwortTextfield = new TextField();
		passwortTextfield.setPromptText("passwort");
		GridPane.setConstraints(passwortTextfield, 1, 1);
		
		
		Button abbrechen = new Button("Abbrechen");
		abbrechen.setOnAction(e -> {
			System.exit(0);
		});
		
		Button login = new Button("Login");
		login.setOnAction(e -> {
			String manuelDerKing = new String("Passwort123");
			String password = passwortTextfield.getText();
			if(password.equals(manuelDerKing)){
				secundaryStage.close();
			}else{
				System.out.println("Falsches Passwort!");
				System.out.println(passwortTextfield.getText());
			}
		});
		
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
		Scene scene = new Scene(layout,350,125);
		secundaryStage.setScene(scene);
		secundaryStage.showAndWait();
	}
}

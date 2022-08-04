package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

//Setting up of the stage.
public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			
			Image icon = new Image("iiumLogo.png");
			primaryStage.getIcons().add(icon);
			primaryStage.setTitle("Mahallah Registration System");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
}

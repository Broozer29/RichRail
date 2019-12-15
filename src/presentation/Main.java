package presentation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox mainWindow = FXMLLoader.load(Main.class.getResource("RichrailHome.fxml"));		
		primaryStage.setScene(new Scene(mainWindow));
		primaryStage.show();
	}
}
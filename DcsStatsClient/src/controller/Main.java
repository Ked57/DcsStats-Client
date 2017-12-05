package controller;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private BorderPane connectionLayout; 
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/launch.fxml"));
			connectionLayout = loader.load();
	    	ConnectionController menu = loader.getController();
		} catch(Exception e) {
			e.printStackTrace();
		}
			Scene scene = new Scene(connectionLayout,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

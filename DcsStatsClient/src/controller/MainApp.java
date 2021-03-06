package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class MainApp extends Application {

	private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/root.fxml"));
			rootLayout = loader.load();
			RootController rootController = loader.getController();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(rootLayout, 700, 350);
		primaryStage.setScene(scene);
		primaryStage.setMaxWidth(750);
		primaryStage.setMinWidth(750);
		primaryStage.setMaxHeight(400);
		primaryStage.setMinHeight(400);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}

package controller;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class RootController {
	
	@FXML
	private BorderPane rootPane;
	@FXML
	private JFXButton logInButton;
	@FXML
	private JFXButton registerButton;
	@FXML
	private JFXButton logOutButton;
	@FXML
	private HBox buttonBox;
	
	private BorderPane connectionPane;
	private BorderPane mainPane;
	
	
	
	private ConnectionController connectionController;
	private MainController mainController;
	
	public void initialize() throws IOException{
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/launch.fxml"));
		connectionPane = loader.load();
		connectionController = loader.getController();
		connectionController.init(this);
		
		loader = new FXMLLoader(getClass().getResource("/view/main.fxml"));
		mainPane = loader.load();
		mainController = loader.getController();
		
		buttonBox.getChildren().remove(logOutButton);
				
		rootPane.setCenter(connectionPane);
	}
	
	@FXML
	public void loginOnAction(){
		
	}
	
	@FXML
	public void logoutOnAction(){
		rootPane.setCenter(connectionPane);
		buttonBox.getChildren().add(0, logInButton);
		buttonBox.getChildren().add(1,registerButton);
		buttonBox.getChildren().remove(logOutButton);
	}
	
	public void connectionCallBack(){
		rootPane.setCenter(mainPane);
		buttonBox.getChildren().remove(logInButton);
		buttonBox.getChildren().remove(registerButton);
		buttonBox.getChildren().add(0,logOutButton);
	}
}

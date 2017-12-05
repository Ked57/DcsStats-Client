package controller;

import javafx.fxml.FXML;

public class ConnectionController {

	private RootController rootController;
	
	
	public void init(RootController rootController){
		this.rootController = rootController;
	}
	
	@FXML
	public void connectionButtonOnAction(){		
		rootController.connectionCallBack();
	}
}

package org.dimigo.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientMain extends Application{
	
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("´Ù¿ìÆ®");
		Parent parent = FXMLLoader.load(getClass().getResource("doubtMain.fxml"));
		Group root = new Group();
		Scene scene = new Scene(parent);
		
		stage.setScene(scene);
		
		stage.show();
	}
}

package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller{
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//Log In Page variables
	@FXML private TextField usernameTF;
	@FXML private PasswordField passwordTF;
	@FXML private Text myLabel;
	String matricnum;
	String password;
	
	public void switchToMain2(ActionEvent event) throws IOException {
		
		
			matricnum = usernameTF.getText();
			password = passwordTF.getText();
				
			try {
			if(matricnum.equals("2115931") && password.equals("N")) {
				
				root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
				
			}
			else if(matricnum.equals("") && password.equals("")){
				myLabel.setText("ERROR!\nYou did not input any data");
			}
			else {
				myLabel.setText("ERROR!\nWrong Password or Username");
			}
			}
			catch(Exception e){
				myLabel.setText("ERROR");
			}
			
	}
	
	 public void addMahallah(MouseEvent event) throws IOException {
		 
		 root = FXMLLoader.load(getClass().getResource("addMahallah.fxml"));
		 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	 }
	 
	 public void ViewDetails(MouseEvent event) throws IOException {
		 
		 root = FXMLLoader.load(getClass().getResource("ViewDetails.fxml"));
		 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	 }
	 
	 public void logOut(MouseEvent event) throws IOException {
		 
		 root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
		 
	 }
	 
	 
	
	
	}



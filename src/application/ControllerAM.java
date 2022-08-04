package application;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

//GUI
public class ControllerAM implements Initializable{

	//Declaration of SceneBuilder variables
	@FXML private ChoiceBox<String> mahallahCB;
	@FXML private ChoiceBox<String> hisbahCB;
	@FXML private ChoiceBox<String> roomCB;
	@FXML private DatePicker myDatePicker;
	@FXML private TextField nameTF;
	@FXML private TextField matricNumTF;
	@FXML private TextField addressTF;
	@FXML private TextField icTF;
	@FXML private TextField contactNoTF;
	@FXML private TextField emailTF;

	//Declaration of global variables for getDetails
	String name;
	String matricnum;
	String address;
	String ic;
	String contactNo;
	String email;

	//Declaration of ChoiceBoxes
	//an array of string filled Mahallah information
	private String[] mahallah = {"Ali", "Bilal", "Siddiq"};
	private String[] hisbah = {"1", "2", "3", "4"};
	private String[] room = {"01", "02", "03", "04","05","06","07","08","09"};
	
	//Declaration of MMS Window
	private Stage stage;
	private Scene scene;
	private Parent root;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		mahallahCB.getItems().addAll(mahallah);
		hisbahCB.getItems().addAll(hisbah);
		roomCB.getItems().addAll(room);
		
	}
	
	//A button with the function of navigating out from the Add Residents GUI
	public void backFromAM(MouseEvent event) throws IOException {
		 
		 root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
		 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
		 
	 }
	
	//A button with the function of saving the students' information into the TableView.
	public void saveButton(ActionEvent event) throws IOException {
		
		LocalDate myDate = myDatePicker.getValue();
		String myFormattedDate = myDate.toString();
		
		int intMatricNum = changeTypeInt(matricNumTF.getText());
		String stringMatricNum = changeTypeInt(intMatricNum);
		
		//Declaration of person object		
		Person person = new Person(nameTF.getText(), stringMatricNum, addressTF.getText(), icTF.getText(), contactNoTF.getText(), 
				emailTF.getText(), myFormattedDate, mahallahCB.getValue(), hisbahCB.getValue(), roomCB.getValue());
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewDetails.fxml"));
		root = loader.load();
		
		ControllerVD controllerVD = loader.getController();
		controllerVD.tableview.getItems().add(person);
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		
	}
	
	// Overloading method
	public int changeTypeInt(String matricnum) {
		
		int doubleMatricNum = Integer.parseInt(matricnum);
		
		return doubleMatricNum;
	}

	// Overloading method
	public String changeTypeInt(int intMatricNum) {
		
		String matricNo = Integer.toString(intMatricNum);

		return matricNo;
	}
	
	


	

}

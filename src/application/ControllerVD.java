package application;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

//GUI
public class ControllerVD implements Initializable{

	//Declaration of SceneBuilder variables
	@FXML private TableColumn<Person, String> colName;
	@FXML private TableColumn<Person, String> colMatricNum;
	@FXML private TableColumn<Person, String> colAddress;
	@FXML private TableColumn<Person, String> colIC;
	@FXML private TableColumn<Person, String> colContactNo;
	@FXML private TableColumn<Person, String> colEmail;
	@FXML private TableColumn<Person, String> colRoom;
	@FXML private TableColumn<Person, String> colHisbah;
	@FXML private TableColumn<Person, String> colMahallah;
	@FXML private TableColumn<Person, String> colCID;
	@FXML TableView<Person> tableview;

	//Declaration of MMS Window
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		

		colName.setCellValueFactory(new PropertyValueFactory<>("name"));
		colMatricNum.setCellValueFactory(new PropertyValueFactory<>("matricnum"));
		colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
		colIC.setCellValueFactory(new PropertyValueFactory<>("ic"));
		colContactNo.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
		colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		colRoom.setCellValueFactory(new PropertyValueFactory<>("room"));
		colHisbah.setCellValueFactory(new PropertyValueFactory<>("hisbah"));
		colMahallah.setCellValueFactory(new PropertyValueFactory<>("mahallah"));
		colCID.setCellValueFactory(new PropertyValueFactory<>("CID"));
		
		tableview.setItems(observableList);
		
	}
	
	//Inserting students' information into the ViewTable.
	ObservableList<Person> observableList = FXCollections.observableArrayList(
			new Person("Aiman","2115931","BJ","020911","0166782930","atapple@mgail.com","4-09-2022","Bilal","4","09"),
			new Person("Zulhazmi","2020292","PP","020927","0194378923","atsamsung@gmail.com","4-09-2002","Bilal","4","09"),
			new Person("Nur Alan","2178902","Pinggiran Selayang","010622","0178923467","atgoogle@gmail.com","4-09-2002","Bilal","4","09"),
			new Person("Ibn Ddu","2169690","Cheras Perdana","030405","01666787790","dduhensem@gmail.com","4-09-2002","Bilal","4","09"),
			new Person("Figroy","2102172","Desaru","020909","0123457686","Petaey@gmail.com","4-09-2002","Bilal","4","09"));
	
	//A button with the function of navigating out from the View Details GUI
	public void backFromVD(MouseEvent event) throws IOException {
		 
		 root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
		 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
		 
	 }
	

	

}

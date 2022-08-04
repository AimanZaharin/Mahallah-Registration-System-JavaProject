package application;

import javafx.beans.property.SimpleStringProperty;

public class Person{	
	
	//Local variables for the Person Class
	SimpleStringProperty name;
	SimpleStringProperty matricnum;
	SimpleStringProperty address;
	SimpleStringProperty ic;
	SimpleStringProperty contactNo;
	SimpleStringProperty email;
	SimpleStringProperty CID;
	SimpleStringProperty mahallah;
	SimpleStringProperty hisbah;
	SimpleStringProperty room;
	
	// A default constructor with no arguments
	Person(){
		
	}
	
	// A constructor with arguments
	Person(String name, String matricnum, String address, String ic, String contactNo, String email, String CID, String mahallah,
			String hisbah, String room) {
		
		this.name = new SimpleStringProperty(name);
		this.matricnum =  new SimpleStringProperty(matricnum);
		this.address = new SimpleStringProperty(address);
		this.ic = new SimpleStringProperty(ic);
		this.contactNo = new SimpleStringProperty(contactNo);
		this.email = new SimpleStringProperty(email);
		this.CID = new SimpleStringProperty(CID);
		this.mahallah = new SimpleStringProperty(mahallah);
		this.hisbah = new SimpleStringProperty(hisbah);
		this.room = new SimpleStringProperty(room);
	}

	//getter method 
	public String getName() {
		return name.get();
	}

	//setter method 
	public void setName(String name) {
		this.name = new SimpleStringProperty(name);
	}

	//getter method
	public String getMatricnum() {
		return matricnum.get();
	}

	//setter method 
	public void setMatricnum(String matricnum) {
		this.matricnum = new SimpleStringProperty(matricnum);
	}

	//getter method 
	public String getAddress() {
		return address.get();
	}

	//setter method 
	public void setAddress(String address) {
		this.address = new SimpleStringProperty(address);
	}

	//getter method 
	public String getIc() {
		return ic.get();
	}

	//setter method 
	public void setIc(String ic) {
		this.ic = new SimpleStringProperty(ic);
	}

	//getter method 
	public String getContactNo() {
		return contactNo.get();
	}

	//setter method 
	public void setContactNo(String contactNo) {
		this.contactNo = new SimpleStringProperty(contactNo);
	}

	//getter method
	public String getEmail() {
		return email.get();
	}

	//setter method 
	public void setEmail(String email) {
		this.email = new SimpleStringProperty(email);
	}
	
	//getter method 
	public String getCID() {
		return CID.get();
	}

	//setter method 
	public void setCID(String CID) {
		this.CID = new SimpleStringProperty(CID);
	}

	//getter method 
	public String getMahallah() {
		return mahallah.get();
	}

	//setter method 
	public void setMahallah(String mahallah) {
		this.mahallah = new SimpleStringProperty(mahallah);
	}

	//getter method 
	public String getHisbah() {
		return hisbah.get();
	}

	//setter method 
	public void setHisbah(String hisbah) {
		this.hisbah = new SimpleStringProperty(hisbah);
	}

	//getter method 
	public String getRoom() {
		return room.get();
	}

	//setter method 
	public void setRoom(String room) {
		this.room = new SimpleStringProperty(room);
	}

	//A toString method
	@Override
	public String toString() {
		
		return "Name: " + name +
				"\nMatric Number: " + matricnum +
				"\nAddress" + address +
				"\nIC: " + ic +
				"\nContact No: " + contactNo +
				"\nEmail: " + email;
	}
	
	
}

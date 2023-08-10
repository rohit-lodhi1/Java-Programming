package com.dollop.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class Contact implements Serializable {
	int id;
   String firstName,lastName,gendar,email;
   ArrayList<String> mobile;
   ArrayList<Address> address;

	public Contact(int id,String firstName, String lastName, String gendar, String email,ArrayList<String> mobile,ArrayList<Address> address) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gendar = gendar;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Contact() {
	  
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGendar() {
		return gendar;
	}

	public void setGendar(String gendar) {
		this.gendar = gendar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<String> getMobile() {
		return mobile;
	}

	public void setMobile(ArrayList<String> mobile) {
		this.mobile = mobile;
	}

	public ArrayList<Address> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", gendar=" + gendar + ", email=" + email
				+ ", mobile=" + mobile + ", address=" + address + "]";
	} 
}

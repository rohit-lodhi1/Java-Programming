package com.dollop.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.dollop.bean.Address;
import com.dollop.bean.Contact;
import com.dollop.model.Db;

//import ToDoList.Db;

public class Test {
    String path ="C://abc";
	Scanner sc = null;
	Db db = null;
	Test()
	{
		sc = new Scanner(System.in);
		db = new Db(path+"\\contacts.obj");
	}
	
	 public int generateId()
	 {
		 Db db = new Db(path+"\\contact_ID.obj");
		  Integer i=(Integer)db.get();
		 if(i==null)
		 {
			 //System.out.println(i);
				db.insert(1);
			 return 1;
		 }
		 else {
			Integer id = i.intValue()+1;
		    id++;
		    db.insert(id);
			return id;
		 }	
	 }	
	
	public static void main(String[] args) {
        Test t = new Test();
        t.homePage();
	}

	private void homePage() {
		System.out.println("-----MENU-----");
		System.out.println("1. ADD CONTACT");
		System.out.println("2. SHOW CONTACT");
		System.out.println("3. UPDATE CONTACT");
		System.out.println("4. DELETE CONTACT");
		System.out.println("5. EXIT");
		int ch = sc.nextInt();
		switch(ch)
		{
		    case 1:
		    	  addContact();
		    	  break;
		    case 2:
		    	  showContact();
		    	  break;
		    case 3:
		    	  updateContact();
		    	  break;
		    case 4:
		    	  deleteContact();
		    	  break;
		    case 5:
		    	   System.exit(ch);
		    	   break;	    	 
		}
	}

	private void deleteContact() {
		// TODO Auto-generated method stub
		
	}

	private void updateContact() {
		// TODO Auto-generated method stub
		
	}

	private void showContact() {
		// TODO Auto-generated method stub
		
	}

	private void addContact() {
		Contact contact = readInfo();
		db.insert(contact);
		System.out.println("SUCCESSFULLY ADDED");
	}

	private Contact readInfo() {
		Contact con = new Contact();
		Address ad = new Address();
		con.setId(generateId());
		System.out.println("ENTRE YOUR FIRST NAME");
		sc.nextLine();
		con.setFirstName(sc.nextLine());
		System.out.println("ENTRE YOUR LAST NAME");
		con.setLastName(sc.nextLine());
		System.out.println("ENTRE YOUR GENDER");
		con.setGendar(sc.nextLine());   
		System.out.println("ENTRE YOUR CONTACT");
		ArrayList<String> mobile = new ArrayList<String>();
		ArrayList<Address> address = new ArrayList<Address>();
		mobile.add(sc.nextLine());
		System.out.println("ENTRE YOUR STATE");
		ad.setState(sc.nextLine());
		System.out.println("ENTRE YOUR CITY");
		ad.setCity(sc.nextLine());
		System.out.println("ENTRE YOUR PINCODE");
		ad.setPinCode(sc.nextLine());
		con.setAddress(address);
		con.setMobile(mobile);
        
		return con;
	}

}

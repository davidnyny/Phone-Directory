//David Nygren

import java.util.*;

public class ContactEntry{

	//Declaring instance variables to use for names and numbers
	private final String name;
	private String number;

	//Constructor that takes in the name and number and sets the instance variables equal to them
	public ContactEntry(String name, String number){
		this.name = name;
		this.number = number;
	}

	//Returns the name
	public String getName(){
		return name;
	}

	//Returns the number
	public String getNumber(){
		return number;
	}

	//Sets the new number
	public void setNumber(String number){
		this.number = number;
	}

	//Returns name and number together; to be used in PhoneContactList class
	public String toString(){
		return name + ": " + number;
	}
}

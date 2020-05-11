//David Nygren

import java.util.*;
import java.io.PrintStream;

public class PhoneContactList{

	//Declaring three different ArrayLists to use for accessing phone numbers and contacts
	private ArrayList<ContactEntry> thePhoneList = new ArrayList<>();

	private ArrayList<String> names = new ArrayList<String>();
	private ArrayList<String> numbers = new ArrayList<String>();

	//This method adds a new contact if one doesn't exist, or changes the number of the existing contact
	public String addOrChangeEntry(String aName, String newNumber){
		ContactEntry change = new ContactEntry(aName, newNumber);
		if (names.indexOf(aName) < 0){
			thePhoneList.add(change);
			names.add(aName);
			numbers.add(newNumber);
			return null;
		}
		else{
			int index = names.indexOf(aName);
			String oldNumber = numbers.get(index);
		       	thePhoneList.set(index, change);
			numbers.set(index, newNumber);
			return aName + "'s old phone number is " + oldNumber;  
		}
	}
	
	//This method removes an entry, given a name, and returns the ContactEntry object of what it removed
	public ContactEntry removeEntry(String aName){
		if(names.indexOf(aName) > -1){
			String oldNum = numbers.get(names.indexOf(aName));
			ContactEntry oldEntry = thePhoneList.get(names.indexOf(aName));
		
			int index = names.indexOf(aName);

			numbers.remove(index);
			names.remove(index);
			thePhoneList.remove(index);	

			System.out.println("Removing a contact from the phone list: ");
			return oldEntry;
		}
		else return null;
	}

	//This method searches for the name of a person in the Phone List. If not found, it returns a "Number not found" message.
	public String searchNumber(String aName){
		if(names.indexOf(aName) >= 0){
			return "Entry: " + aName + ": " + numbers.get(names.indexOf(aName));
		}
		else return "Entry: " + aName + ": Number not found.";
	}

	//toString() method that returns the phone list in complete words.
	public String toString(){
		System.out.println();
		String results = "";
		System.out.println( "Phone list:");
		for(ContactEntry i : thePhoneList){
			results += i;
			results += "\n";
		}
		return results;
	}

}

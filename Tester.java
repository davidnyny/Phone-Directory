/**
 * 
 *   Creates a PhoneContactList with five entries.
 *
 *
 *
 * Your output should look something like this:
 
     
     Current Phone List:
        Smith, Alice: 309-111 3333
        Lang, Lee: 309-222 4444
        Carr, John: 309-333 5555
        Hofman, Rita: 309-444 6666
        Lar, Tom: 309-555 7777
     
     Carr, John's phone number is 309-333 5555
     Rita's old phone number is 309-444 6666
     Removing a contact from the phone list
        Lang, Lee: 309-222 4444 has been removed
     Entry: Lang, Lee; not found in the phone contact list
     
     Current Phone List:
        Smith, Alice: 309-111 3333
        Carr, John: 309-333 5555
        Hofman, Rita: 309-444 9999
        Lar, Tom: 309-555 7777
     
     Removing entry that does not exit
     null
 
 --- finished ----

 */

public class Tester {

    public static void main(String[] args) {
        
        System.out.println("\n---Homework 3 output----");
        PhoneContactList myEntry = new PhoneContactList();

        /* Adding contacts to the list */
        myEntry.addOrChangeEntry("Smith, Alice", "309-111 3333");
        myEntry.addOrChangeEntry("Lang, Lee", "309-222 4444");
        myEntry.addOrChangeEntry("Carr, John", "309-333 5555");
        myEntry.addOrChangeEntry("Hofman, Rita", "309-444 6666");
        myEntry.addOrChangeEntry("Lar, Tom", "309-555 7777");
        
        
        System.out.println(myEntry.toString());
        
        System.out.println(myEntry.searchNumber("Carr, John"));
                           
        System.out.println(myEntry.addOrChangeEntry("Hofman, Rita", "309-444 9999"));
        
        
        System.out.println(myEntry.removeEntry("Lang, Lee") + " has been removed");
        
        System.out.println(myEntry.searchNumber("Lang, Lee"));
        
        
        System.out.println(myEntry.toString());
        
	System.out.println("Removing entry that does not exist");       
        System.out.println(myEntry.removeEntry("Holms, Petter"));
        
        
        System.out.println("\n--- finished ----\n");
    }
}

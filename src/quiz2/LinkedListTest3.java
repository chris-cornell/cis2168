//LinkedListTest3.java (Code not in textbook.)
//* Use array and Linked list of objects of Computer class and its subclasses
//* Create and populate a Linked list of objects of Computer class and its subclasses,
//*   display each item in the linked list, 
//*   display the location of a specific Computer object in the list

package linkedlist_app;

//import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author cindy
 */
public class LinkedListTest3 {

    public static void main(String[] args) { 
        //Create an array, storing objects of Computer class and its subclasses
        Computer[] myComputers = new Computer[3];
        //populate the array
        myComputers[0] = new Notebook2("Bravo", "Intel", 4, 240, 2.4, 15.0, 7.5);
        myComputers[1] = new Computer("Ace", "AMD", 3, 160, 2.4);
        myComputers[2] = new Notebook2("HP", "Intel", 8, 1000, 3.5, 14.0, 4.5);
        for (int i = 0; i < 3; i++) {
            System.out.println(myComputers[i].toString());
            System.out.println();
        }
        
        System.out.println("----Linked List-----------");
        //ArrayList<Computer> myComputerList = new ArrayList<>(); //diamond operator
        //create an empty linked list, storing objects of Computer class and its subclasses
        LinkedList<Computer> myComputerList = new LinkedList<>(); 
        //Append to the linked list 3 objects of Computer and its subclass Notebook2
        myComputerList.add(new Notebook2("Bravo", "Intel", 4, 240, 2.4, 15.0, 7.5));
        myComputerList.add(new Computer("Ace", "AMD", 3, 160, 2.4));
        myComputerList.add(new Notebook2("HP", "Intel", 8, 1000, 3.5, 14.0, 4.5));
        
        //Display each item in the linked list
        for (int i = 0; i < 3; i++) {
            Computer currentItem = myComputerList.get(i);
            System.out.println(currentItem.toString());
            //The line below is equivalent to the two lines above.
            //System.out.println(myComputerList.get(i).toString());
            System.out.println();
        }    
        
        //Do something with a specific item in the linked list
        //create a new Computer object and have variable someComputer referencing it
        Computer someComputer = new Computer("Ace", "AMD", 3, 160, 2.4);
        myComputerList.add(someComputer);
        //display the location of the new Computer object in the linked list
        System.out.println(myComputerList.indexOf(someComputer));        
    }
}

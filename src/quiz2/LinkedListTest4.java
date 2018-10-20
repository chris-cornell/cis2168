//LinkedListTest4.java (Code not in textbook.)
//* Use java.util.List interface
//* Do the same tasks as LinkedListTest3.java but use java.util.List interface,
//*    so that the actually list can be either array list or linked list.
//* Use array and list (linked list or array list)
//* Use a List (array list or linked list) of objects of Computer class and its subclasses
//* Create and populate a List (array list or linked list) of objects of Computer class and its subclasses,
//*   display each item in the linked list, 
//*   display the location of a specific Computer object in the list

package linkedlist_app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author cindy
 */
public class LinkedListTest4 {

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
        
        System.out.println("-----List-----------");
        //ArrayList<Computer> myComputerList = new ArrayList<>(); //diamond operator
        //LinkedList<Computer> myComputerList = new LinkedList<>(); 
        
        //create an empty list (linked list), storing objects of Computer class and its subclasses        
        List<Computer> myComputerList = new LinkedList<>();
        //create an empty list (array list), storing objects of Computer class and its subclasses               
        //List<Computer> myComputerList = new ArrayList<>(); 
        
        //Append to the list (array list or linked list) 3 objects of Computer and its subclass Notebook2
        myComputerList.add(new Notebook2("Bravo", "Intel", 4, 240, 2.4, 15.0, 7.5));
        myComputerList.add(new Computer("Ace", "AMD", 3, 160, 2.4));
        myComputerList.add(new Notebook2("HP", "Intel", 8, 1000, 3.5, 14.0, 4.5));
        
        //display each item in the list (array list or linked list)
        for (int i = 0; i < 3; i++) {
            Computer currentItem = myComputerList.get(i);
            System.out.println(currentItem.toString());
            //The line below is equivalent to the two lines above.
            //System.out.println(myComputerList.get(i).toString());
            System.out.println();
        }    
        
        //Do something with a specific item in the list (array list or linked list)
        //create a new Computer object and have variable someComputer referencing it
        Computer someComputer = new Computer("Ace", "AMD", 3, 160, 2.4);
        myComputerList.add(someComputer);
        //display the location of the new Computer object in the list (linked list or array list)
        System.out.println(myComputerList.indexOf(someComputer));        
        
    }
}

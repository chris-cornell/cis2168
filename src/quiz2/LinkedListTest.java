//LinkedListTest.java (Code not in textbook.)
//* Basic usage of java.util.LinkedList
//* Linked list of Integer objects, String objects

package linkedlist_app;

//import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Cindy
 */
public class LinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList<Integer> myList = new ArrayList<Integer>();
        LinkedList<Integer> myList = new LinkedList<Integer>();
        
        myList.add(new Integer(10)); // ok
        myList.add(5); // also ok! 5 is automatically wrapped in an Integer object
        //myList.add(new String("2168")); // generates a type incompatability error
        //myList.add(new String("10"));
        
        myList.add(20);
        myList.add(10);
        myList.add(100);
        System.out.println(myList);
        
        System.out.println(myList.get(1));
        System.out.println(myList);
        
        System.out.println(myList.indexOf(20));
        System.out.println(myList.indexOf(1000));        
        
        myList.remove(1);
        System.out.println(myList);
        
        //ArrayList<String> courses = new ArrayList<>();
        //Linked list of String objects
        LinkedList<String> courses = new LinkedList<>();
        courses.add("2168");
        courses.add("1068");
        courses.add("3309");
        System.out.println("\n" + courses);
        courses.remove(2);          //remove by location 
        System.out.println(courses);  
        
        courses.remove("1068");     //remove by content
        System.out.println(courses);         
    }
    public void removeMiddleString(LinkedList<String> l)
    {
        l.add(l.remove(l.size()/2));
    }

}

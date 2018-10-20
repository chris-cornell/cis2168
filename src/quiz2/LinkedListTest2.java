//LinkedListTest2.java (Code not in textbook.)
//* Use array and Linked list
//* Populate and process each element in Linked list of Integer objects
package linkedlist_app;

//import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author cindy
 */
public class LinkedListTest2 {

    public static void main(String[] args) {
        //ArrayList<Integer> someInts = new ArrayList<Integer>();
        //create an empty linked list of Integer objects
        LinkedList<Integer> someInts = new LinkedList<Integer>();
        int[] nums = {5, 7, 2, 15};
        //use an array to populate the linked list
        for (int i = 0; i < nums.length; i++) {
            someInts.add(nums[i]);
        }

        //Process each element in linked list of Integer objects
        // Compute and display the sum
        int sum = 0;
        for (int i = 0; i < someInts.size(); i++) {
            sum += someInts.get(i);
        }
        System.out.println("sum is " + sum);
    }
}

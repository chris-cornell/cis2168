//File: SimpleLinkedList.java. (code not in textbook).
//* Implement a single linked list of integers of int type
//* More about nested classes:
//Nested classes that are declared static are called static nested classes. 
//Non-static nested classes are called inner classes. 
//Non-static nested classes (inner classes) have access to other members of the enclosing class, even if they are declared private. 
//Static nested classes do not have access to other members of the enclosing class. 

package quiz3;

/**
 * @author cindy
 */
public class SimpleLinkedList {

    //Nested class Node, enclosing class: SimpleLinkedList
    //static: Node class can not access other memebers in enclosing class
    //private: only enclosing class SimpleLinkedList uses Node
    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
            next = null;
        }
    }

    //the reference to the first Node in the linked list.
    private Node head;

    //create an empty linked list
    public SimpleLinkedList() {
        head = null;
    }

    //append newItem
    public void add(int newItem) {
        Node temp = new Node(newItem);
        if (head == null) { //empty list
            head = temp;
        } else { //non-empty list
            //locate last node
            Node current = head;    //start with the first node
            while (current.next != null) {  //check if current node is not the last node
                current = current.next;     //move on to the next node on the list
            }
            current.next = temp;    //append the new node immediately following the current node
        }
    }
    public int getTotal()
    {
        int sum=0;
        Node current=head;
        if(head==null){
            return 0;
        }
        while(current!=null) {
            sum+=current.data;
            current=current.next;
        }
        return sum;
    }
    //return a string that contains all integers (in the original sequence) in the linked list.
    @Override
    public String toString() {
        String result = "";     //result string

        //solution 1:
        Node current = head;        //start with first Node
        while (current != null) {   //check if there is still nodes remaining
            result += current.data; //add the integer in current Node to the result string
            result += "==>";        
            current = current.next; //move on to the next Node
        }
        return result;
    }
}

//File: SimpleLinkedList.java. (code not in textbook).
//* Implement a single linked list of integers of int type
//* More about nested classes:
//Nested classes that are declared static are called static nested classes. 
//Non-static nested classes are called inner classes. 
//Non-static nested classes (inner classes) have access to other members of the enclosing class, even if they are declared private. 
//Static nested classes do not have access to other members of the enclosing class. 
package assignment2;

/**
 * @author cindy/chris
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

    public int getHowMany() {
        int count = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public boolean belongs(int item) {
        Node current = head;
        while (current != null) {
            if (current.data == item) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int get(int index) {
        try {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        } catch (java.lang.NullPointerException e) {
            System.out.println("NullPointerException: Requested index " + index + " is larger than maximum index " + (this.getHowMany() - 1) + " of LinkedList.");
            return -1;
        }
    }

    public boolean add(int index, int item) {
        Node temp;
        Node current;
        Node newNode = new Node(item);
        if (index == 0) { // adding to beginning?
            temp = head;
            head = newNode;
            head.next = temp;
        } else {
            try {
                current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                temp = current.next;
                current.next = newNode;
                newNode.next = temp;
            } catch (java.lang.NullPointerException e) {
                System.out.println("Error: Index " + index + " is out of bounds.");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object list) {
        SimpleLinkedList aList;
        aList = (SimpleLinkedList) list;
        if (this.getHowMany() != aList.getHowMany()) // if they aren't the same size, they aren't equal
        {
            return false;
        }
        for (int i = 0; i < this.getHowMany(); i++) {
            if (this.get(i) != aList.get(i)) //if at any point there are two different values in the same index
            {
                return false; //then the lists are not equal
            }
        }
        return true; //if the above never happens, then they are equal
    }

    public boolean removeByValue(int value) {
        try {
            if (head.data == value) {
                head = head.next;
                return true;
            }
            Node current = head;
            while (current != null) {
                current = current.next;
                if (current.next.data == value) {
                    current.next = current.next.next;
                    return true;
                }
            }
            return true;
        } catch (java.lang.NullPointerException e) {
            System.out.println("Value " + value + " is not in LinkedList");
            return false;
        }
    }

    public boolean removeByIndex(int index) { // bonus
        Node current = head;
        if (index >= this.getHowMany()) {
            System.out.println("Index out of bounds");
            return false;
        }
        if (index == 0) {
            head = head.next;
            return true;
        }
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return true;
    }
}

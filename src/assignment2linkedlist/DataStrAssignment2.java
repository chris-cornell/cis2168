/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2linkedlist;

/**
 *
 * @author corne
 */
import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;
import java.util.LinkedList;

public class DataStrAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test for pt1
        SimpleLinkedList b = new SimpleLinkedList();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        System.out.println(b);

        //pt2
        ManageAssignments mgr = new ManageAssignments();
        //Assignment a1 = new Assignment("2168","Assig1", new Date(2018 - 1900,9,7));
        //Assignment a2 = new Assignment("2107","assignment3", new Date(2018 - 1900,9,6));
        //mgr.add(a1);
        //mgr.add(a2);
        mgr.menu();
    }

}

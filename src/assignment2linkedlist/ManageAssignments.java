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
import java.util.LinkedList;
import java.util.Date;
import javax.swing.JOptionPane;

public class ManageAssignments {

    LinkedList<Assignment> assignList;
    JOptionPane pane = new JOptionPane();

    public ManageAssignments() {
        assignList = new LinkedList();
    }

    public ManageAssignments(LinkedList<Assignment> list) {
        assignList = list;
    }

    public boolean add(Assignment a) {
        return assignList.add(a);
    }

    public void add(int index, Assignment a) {
        assignList.add(index, a);
    }

    public void completeAssignment(int index) {
        assignList.remove(index);
    }

    public String getAssignList() {
        String str = "";
        for (int i = 0; i < assignList.size(); i++) {
            str += i + ": ";
            str += assignList.get(i) + "\n";
        }
        return str;
    }

    public LinkedList<Assignment> getEarliestAssignments() {
        LinkedList<Assignment> earliestAssigns = new LinkedList();
        Date current, earliest;
        earliest = assignList.get(0).getDueDate();

        for (int i = 0; i < assignList.size(); i++) // get the earliest date in the list
        {
            current = assignList.get(i).getDueDate();
            if (current.before(earliest)) {
                earliest = current;
            }
        }
        for (int i = 0; i < assignList.size(); i++) {
            if (assignList.get(i).getDueDate().equals(earliest)) {
                earliestAssigns.add(assignList.get(i));
            }
        }
        return earliestAssigns;
    }

    public void menu() {
        String response = JOptionPane.showInputDialog("Enter one of the following options: \nAdd\nRemove\nGetAll\nGetEarliest\nExit").toLowerCase();
        switch (response) {
            case "add":
                String course = pane.showInputDialog("Enter course name: ");
                String assig = pane.showInputDialog("Enter assignment name: ");
                String dateStr = pane.showInputDialog("Enter date in YYYYMMDD format: "); //(2018 - 1900,9,7));
                //System.out.println("year " + (Integer.parseInt(dateStr.substring(0,3))));
                Date dueDate = new Date(Integer.parseInt(dateStr.substring(0, 4)) - 1900, (Integer.parseInt(dateStr.substring(4, 6)) - 1), (Integer.parseInt(dateStr.substring(6, 8))));
                add(new Assignment(course, assig, dueDate));
                this.menu();
                break;
            case "remove":
                int removalIndex;
                String input;
                input = pane.showInputDialog(getAssignList() + "\nEnter the index that you wish to remove: ");
                removalIndex = Integer.parseInt(input);
                completeAssignment(removalIndex);
                menu();
                break;
            case "getall":
                pane.showMessageDialog(pane, getAssignList());
                menu();
                break;
            case "getearliest":
                pane.showMessageDialog(pane, getEarliestAssignments());
                menu();
                break;
            case "exit":
                break;
        }
    }
}

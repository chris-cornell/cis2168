/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3linkedstackqueue;

import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author Chris
 */
public class HiringApp {

    private Queue<Person> applicants = new LinkedList<Person>();
    private Stack<Person> employees = new Stack();
    private Stack<Person> fired = new Stack();
    private String[] choices = {"Accept application", "Hire", "Fire", "Quit"};
    private JOptionPane pane = new JOptionPane();

    private void message(String s) {
        pane.showMessageDialog(null, s);
    }

    public void manage() {
        int response = pane.showOptionDialog(null, ("Current Employees: " + employees.toString() + "\nRecently Fired: " + fired.toString() + "\nApplicants: " + applicants.toString()), /*Title*/ "Chooose an option", 0, 0, null, /*Options*/ choices, "abc");
        //System.out.println(response);
        switch (response) {
            case 0: //Accept application
                applicants.offer(new Person(JOptionPane.showInputDialog("Enter applicant's name")));
                message("Accepted application from " + applicants.peek());
                manage();
                break;
            case 1: //Hire
                // case 1 : fired and applicants are empty
                if (fired.isEmpty() && applicants.isEmpty()) {
                    message("Supervisor: There are no applicants and nobody has been fired!");
                    manage();
                    break;
                }
                if (!fired.isEmpty()) // case 2 : fired is not empty
                {
                    message("Hired " + fired.peek() + " from fired employees.");
                    employees.push(fired.pop());
                    manage();
                    break;
                }
                message("Hired " + applicants.peek() + " from application pool.");
                employees.push(applicants.poll());
                manage();
                break;
            case 2: //Fire
            {
                // case 1: no employees
                if (employees.isEmpty()) {
                    pane.showMessageDialog(null, "Supervisor: There are no employees to fire.");
                    manage();
                    break;
                }
                message("Fired " + employees.peek() + ", the most recent hire.");
                fired.push(employees.pop());
                manage();
                break;
            }
            case 3: //Quit
            {
                System.exit(0);
                break;
            }
        }
    }
}

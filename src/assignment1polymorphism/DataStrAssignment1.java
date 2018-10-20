/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1polymorphism;

/**
 *
 * @author corne
 */
public class DataStrAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Student("Chris", "123-45-9876", "Male", "123 Temple St", "2154501245", 19, 3.4, "Undeclared", 2021);
        people[1] = new HourlyEmployee();
        people[2] = new SalaryEmployee();

        //testing ability to use methods of child class
        ((Student) people[0]).setMajor("Computer Science");

        //display the array
        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ": \n" + people[i] + "\n====");
        }
    }

}

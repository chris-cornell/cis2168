//ManageStudents.java (Code not in textbook.)
//* Use java.util.LinkedList to manage students in a course section like cis2168 sec 005
//* Create and populate a linked list of Student objects
//* Display the information of each student in the linked list
//* Find and display a specific student's grade based on a given first name
//* Remove a student from the linked list (delete by content)
//* Display the location of a specific student in the linked list

package linkedlist_app;

import java.util.LinkedList;

/**
 *
 * @author cindy
 */
public class ManageStudents {

    public static void main(String[] args) {
        //Create an empty linked list of Student objects
        LinkedList<Student> students2168 = new LinkedList<>();

        //Create 3 Student objects and have variables s1, s2, s3 referencing them
        Student s1 = new Student(111, "Brad", "Pitt", 85);
        Student s2 = new Student(222, "Angelina", "Jolie", 80);
        Student s3 = new Student(333, "Donald", "Trump", 75);

        //Append to the linked list 3 Student objects        
        students2168.add(s1);
        students2168.add(s2);
        students2168.add(s3);

        //display each student in the linked list
        for (int i = 0; i < students2168.size(); i++) {
            Student currentStudent = students2168.get(i);
            System.out.println(currentStudent.toString());
            //The line below is equivalent to the two lines above
            //System.out.println(students2168.get(i));
        }
        System.out.println();

        //find and display Brad's grade
        System.out.print("Brad's grade: ");
        for (int i = 0; i < students2168.size(); i++) {
            Student s = students2168.get(i);
            // if current student's first name is Brad
            if (s.getFirstName().equals("Brad")) {
                System.out.println(s.getGrade());
                System.out.println();
                break;
            }
        }

        //remove from the linked list the Student object referenced by s2
        students2168.remove(s2);
        //For verification/debugging:
        //   display each student information in the linked list after deletion
        System.out.println("after removing s2: ");
        for (int i = 0; i < students2168.size(); i++) {
            System.out.println(students2168.get(i));
        }
        System.out.println();

        //find and display the location of specific Student objects in the linked list
        System.out.println("Location of s3, s2: ");
        System.out.println(students2168.indexOf(s3));
        System.out.println(students2168.indexOf(s2));
    }
}

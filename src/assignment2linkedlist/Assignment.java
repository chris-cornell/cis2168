package assignment2linkedlist;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author chris
 */
public class Assignment {

    String courseId;
    String assigName;
    Date dueDate;

    //define your constructor
    public Assignment(String courseId, String assigName, Date dueDate) {
        this.courseId = courseId;
        this.assigName = assigName;
        this.dueDate = dueDate;
    }

    //define your getters and setters
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setAssigName(String assigName) {
        this.assigName = assigName;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getAssigName() {
        return assigName;
    }

    public Date getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "\nCourse ID: " + courseId + " | Assignment Name: " + assigName + " | Due Date: " + dueDate;
    }
}

package assignment1;

/**
    CIS2168 006 Fall 2018 Data Structures
    Chris Cornell - chriscornell@temple.edu
    Assignment 1
    Program name: HourlyEmployee
    Program description: Student class, with parent class Person.
**/
public class Student extends Person 
{
    private double gpa;
    private String major;
    private int gradYear;
    
    public Student()
    {
        super();
        gpa=4.0;
        major="Computer Science";
        gradYear=2021;
    }
    public Student(
            String name, String ssn, String gender, String address, String phoneNumber, int age, //all constructor arguments for Person
            double gpa, String major, int gradYear) //all constructor arguments for Student
    {
        super(name, ssn, gender, address, phoneNumber, age);
        this.gpa=gpa;
        this.major=major;
        this.gradYear=gradYear;
    }
    
    public double getGPA() { return gpa; }
    public String getMajor() { return major; }
    public int getGradYear() { return gradYear; }
    
    public void setGPA(double gpa) { this.gpa = gpa; }
    public void setMajor(String major) { this.major=major; }
    public void setGradYear(int gradYear) { this.gradYear = gradYear; }
    
    @Override
    public String toString()
    {
        String info=super.toString();
        return info + "\nGPA: " + gpa+ "\nMajor: " + major + "\nGraduation Year: " + gradYear;
    }
}

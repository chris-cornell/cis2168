package assignment1;

/**
    CIS2168 006 Fall 2018 Data Structures
    Chris Cornell - chriscornell@temple.edu
    Assignment 1
    Program name: Employee
    Program description: Employee class, with parent class Person and child classes HourlyEmployee and SalaryEmployee.
**/
abstract class Employee extends Person {
    //vars
    private String department;
    private String title;
    private int hireYear;
    //constructors
    public Employee()
    {
        super();
        department="Software";
        title="SWE";
        hireYear=2018;
    }
    public Employee(
            String name, String ssn, String gender, String address, String phoneNumber, int age, //constructor arguments for Person
            String department, String title, int hireYear) //constructor arguments for Employee
    {
        super(name,ssn,gender,address,phoneNumber,age);
        this.department=department;
        this.title=title;
        this.hireYear=hireYear;
    }
    //BONUS Pt1. Abstract method computePay()
    abstract double computePay();
    //getters
    public String getDepartment() { return department; }
    public String getTitle() { return title; }
    public int getHireYear() { return hireYear; }
    //setters
    public void setDepartment(String department) { this.department=department; }
    public void setTitle(String title) { this.title=title; }
    public void setHireYear(int hireYear) { this.hireYear = hireYear; }
    //toString
    @Override
    public String toString()
    {
        String info = super.toString();
        return info + "\nDepartment: " + department + "\nTitle: " + title + "\nHire Year: " + hireYear;
    }
}

package assignment1;

/**
    CIS2168 006 Fall 2018 Data Structures
    Chris Cornell - chriscornell@temple.edu
    Assignment 1
    Program name: HourlyEmployee
    Program description: Parent class, used for each child class in this assignment. Contains basic information about the Employee or Student.
**/
public class Person {
    
    private String name;
    private String ssn;
    private String gender;
    private String address;
    private String phoneNumber;
    private int age;

    
    //default constructor
    public Person()
    {
        name="Chris";
        ssn="123-45-6789";
        gender="Male";
        address="123 Main St";
        phoneNumber="2151231234";
        age=19;
    }
    //overloaded constructor
    public Person(String name, String ssn, String gender, String address, String phoneNumber, int age)
    {
        this.name=name;
        this.ssn=ssn;
        this.gender=gender;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.age=age;
    }
    
    public String getName() { return name; }
    public String getSSN(){ return ssn; }
    public String getGender(){ return gender; }
    public String getAddress() { return address; }
    public String getPhone() { return phoneNumber; }
    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }
    public void setSSN(String ssn) { this.ssn = ssn; }
    public void setGender(String gender) { this.gender = gender; }
    public void setAddress(String address) { this.address = address; }
    public void setPhone(String phoneNumber) { this.phoneNumber=phoneNumber; }
    public void setAge(int age) { this.age=age; }

    public String toString()
    {
        return "Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nAddress: " 
                + address + "\nPhone Number: " + phoneNumber + "\nSSN: " + ssn;
    }
}
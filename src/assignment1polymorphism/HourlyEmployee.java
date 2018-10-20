package assignment1polymorphism;

/**
 * CIS2168 006 Fall 2018 Data Structures Chris Cornell - chriscornell@temple.edu
 * Assignment 1 Program name: HourlyEmployee Program description: HourlyEmployee
 * class, with parent class Employee. 
*
 */
public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;
    private double unionDues;

    //default constructor
    public HourlyEmployee() {
        super();
        hourlyRate = 7.25;
        hoursWorked = 40;
        unionDues = 50;
    }

    //overloaded constructor
    public HourlyEmployee(
            String name, String ssn, String gender, String address, String phoneNumber, int age, //all constructor arguments for Person
            String department, String title, int hireYear, //all constructor arguments for Employee
            double hourlyRate, double hoursWorked, double unionDues) //all constructor arguments for HourlyEmployee
    {
        super(name, ssn, gender, address, phoneNumber, age, department, title, hireYear);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.unionDues = unionDues;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getUnionDues() {
        return unionDues;
    }

    @Override
    public double computePay() {
        return (hourlyRate * hoursWorked) - unionDues;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setUnionDues(double unionDues) {
        this.unionDues = unionDues;
    }

    @Override
    public String toString() {
        String info = super.toString();
        return info + "\nHourly Rate: " + hourlyRate + "\nHours Worked: " + hoursWorked + "\nUnion Dues: " + unionDues + "\nMonthly Pay: $" + (hourlyRate * hoursWorked * 4);
    }
}

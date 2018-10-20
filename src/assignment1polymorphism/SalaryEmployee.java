package assignment1polymorphism;

/**
 * CIS2168 006 Fall 2018 Data Structures Chris Cornell - chriscornell@temple.edu
 * Assignment 1 Program name: HourlyEmployee Program description: SalaryEmployee
 * class, with parent class Employee.
*
 */
public class SalaryEmployee extends Employee {

    //variables
    private int annualSalary;

    //constructors
    public SalaryEmployee() {
        super();
        annualSalary = 56516;
    }

    public SalaryEmployee(
            String name, String ssn, String gender, String address, String phoneNumber, int age, //all constructor arguments for Person
            String department, String title, int hireYear, //all constructor arguments for Employee
            int annualSalary) //all constructor arguments for SalaryEmployee
    {
        super(name, ssn, gender, address, phoneNumber, age, department, title, hireYear);
        this.annualSalary = annualSalary;
    }

    //getter
    public int getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public double computePay() {
        return (double) annualSalary;
    }

    //setter
    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    //toString
    @Override
    public String toString() {
        String info = super.toString();
        return info + "\nAnnual Salary: $" + annualSalary + "\nMonthly Pay: $" + annualSalary / 12;
    }
}

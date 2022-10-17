package oop;

// Encapsulation -> Bundle the data/fields and methods that operate on the data in a single unit (class)
public class Employee {
    // Abstraction -> Reduce complexity by hiding the implementation detail
    private int baseSalary;
    private int hourlyRate;

    // Static Field -> Share across all objects
    public static int numberOfEmployees;

    // Constructor
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate( hourlyRate);
        numberOfEmployees++;
    }

    // Static Method
    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    // Constructor Overloading
    public Employee(int baseSalary) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    // Method Overloading
    public int calculateWage(int extraHours) {
        return baseSalary + hourlyRate * extraHours;
    }

    public int calculateWage() {
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <=0) throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0) throw new IllegalArgumentException("Hourly rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}

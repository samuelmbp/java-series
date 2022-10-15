import oop.Employee;
import oop.TextBox;

public class Main {
    public static void main(String[] args) {
        // ===================================
        // NOTE: Procedural Programming
        // ===================================
//        int baseSalary = 50_000;
//        int extraHours = 10;
//        int hourlyRate = 20;
//
//        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
//        System.out.println(wage);

        // ===================================
        // Encapsulation
        // ===================================
        Employee employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }

    // ===================================
    // NOTE: Procedural Programming
    // ===================================
    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
        return baseSalary + extraHours * hourlyRate;
    }
}

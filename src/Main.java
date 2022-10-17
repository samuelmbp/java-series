import oop.Employee;

public class Main {
    public static void main(String[] args) {
        // ===================================
        // Encapsulation
        // ===================================
        Employee employee = new Employee(50_000, 20);
//        Employee employee = new Employee(50_000);
        int wage = employee.calculateWage(10);
        System.out.println(wage);

        // ===================================
        // Static Members
        // ===================================
        System.out.println(Employee.numberOfEmployees);
        Employee.printNumberOfEmployees();
    }
}

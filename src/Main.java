import oop.Employee;

public class Main {
    public static void main(String[] args) {
        // ===================================
        // Encapsulation
        // ===================================
        Employee employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        System.out.println(employee.getBaseSalary());
        System.out.println(employee.getHourlyRate());

        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}

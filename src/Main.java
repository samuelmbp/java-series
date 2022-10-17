import oop.Browser;
import oop.Employee;

public class Main {
    public static void main(String[] args) {
        // ===================================
        // Encapsulation
        // ===================================
        Employee employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);

        // Coupling
        Browser browser = new Browser();
        browser.navigate("...");
    }
}

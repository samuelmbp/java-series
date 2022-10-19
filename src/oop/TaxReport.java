package oop;

public class TaxReport {
    // Interface
    private final TaxCalculator taxCalculator;

    // Constructor Dependency Injection
    public TaxReport(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void show() {
        double tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }
}

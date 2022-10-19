package oop;

public class TaxReport {
    // Interface
    private TaxCalculator taxCalculator;

    // Constructor Dependency Injection
//    public TaxReport(TaxCalculator taxCalculator) {
//        this.taxCalculator = taxCalculator;
//    }

    // Method Dependency Injection
    public void show(TaxCalculator taxCalculator) {
        double tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }

    // Setter - Dependency Injection
//    public void setTaxCalculator(TaxCalculator taxCalculator) {
//        this.taxCalculator = taxCalculator;
//    }
}

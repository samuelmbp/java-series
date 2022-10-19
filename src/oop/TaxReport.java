package oop;

public class TaxReport {
    private TaxCalculator taxCalculator;

    public TaxReport() {
        taxCalculator = new TaxCalculator(100_000);
    }

    public void show() {
        double tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }
}

package oop;

public class TaxCalculator {
    private int taxableIncome;


    public TaxCalculator(int taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}

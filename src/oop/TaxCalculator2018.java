package oop;

// A class can implement one or more interfaces
public class TaxCalculator2018 implements TaxCalculator {
    private final int taxableIncome;

    public TaxCalculator2018(int taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}

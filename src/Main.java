import oop.TaxCalculator2018;
import oop.TaxCalculator2019;
import oop.TaxReport;

public class Main {
    public static void main(String[] args) {
        TaxCalculator2018 taxCalculator = new TaxCalculator2018(100_000);
        TaxReport taxReport = new TaxReport(taxCalculator);
        taxReport.show();

        // Setter Injection
        taxReport.setTaxCalculator(new TaxCalculator2019());
        taxReport.show();
    }
}

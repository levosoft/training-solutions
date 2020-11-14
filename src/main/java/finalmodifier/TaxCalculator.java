package finalmodifier;

public class TaxCalculator {
    public static final double TAX = 0.27;

    public static void main(String[] args) {
        TaxCalculator tc = new TaxCalculator();

        System.out.println(tc.tax(100));
        System.out.println(tc.priceWithTax(100));
    }

    public double tax(double price){
        return price * TAX;
    }

    public double priceWithTax(double price){
        return price * (1 + TAX);
    }
}

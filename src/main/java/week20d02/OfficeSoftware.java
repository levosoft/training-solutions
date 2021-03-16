package week20d02;

public class OfficeSoftware extends Software {

    double price = super.getPrice();

    public OfficeSoftware(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void increasePrice() {
        this.price = price * 1.05;
    }
}

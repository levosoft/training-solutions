package week20d02;

public class DeveloperSoftware extends Software{

    public DeveloperSoftware(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void increasePrice() {
        price = price * 1.1;
    }
}

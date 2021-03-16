package week20d02;

public class Software {

    private String name;
    protected double price;

    public Software(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void increasePrice(){
        double multiplier = 1.0;

        price = price * multiplier;
    }
}

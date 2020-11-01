package classsctructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
        this.stock = 0;
    }

    public int store(int stock){
        this.stock = this.stock + stock;
        return this.stock;
    }

    public int dispatch(int stock){
        this.stock = this.stock - stock;
        return this.stock;
    }
}

package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public int getNumberOfExpired(){
        int num = 0;

        for (Product p: products){
            if(p.getBestBefore().isBefore(LocalDate.now())){
                num++;
            }
        }
        return num;
    }

}

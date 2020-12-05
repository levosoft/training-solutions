package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> productList = new ArrayList<>();

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public int getProductByCategoryName(Category category){
        int categorySum = 0;

        for (Product p: productList) {
            if(p.getCategory().equals(category)){
                categorySum++;
            }
        }
        return categorySum;
    }
}

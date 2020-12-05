package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    void test1(){
        Category f = Category.FROZEN;
        Category d = Category.DAIRY;
        Category b = Category.BAKEDGOODS;
        Category o = Category.OTHER;

        Product p1 = new Product("pálcikás jégkrém", f, 350);
        Product p2 = new Product("zacskóstej", d, 190);
        Product p3 = new Product("kakaóscsiga", b, 220);
        Product p4 = new Product("ananászkonzerv", o, 850);
        Product p5 = new Product("túrós batyu", b, 180);

        List<Product> productList = Arrays.asList(p1,p2,p3,p4,p5);

        Store store = new Store(productList);

        assertEquals(2, store.getProductByCategoryName(b));
    }

    @Test
    void test2(){
        Category f = Category.FROZEN;
        Category d = Category.DAIRY;
        Category b = Category.BAKEDGOODS;
        Category o = Category.OTHER;

        Product p1 = new Product("pálcikás jégkrém", f, 350);
        Product p2 = new Product("zacskóstej", d, 190);
        Product p3 = new Product("kakaóscsiga", b, 220);
        Product p4 = new Product("ananászkonzerv", o, 850);
        Product p5 = new Product("túrós batyu", b, 180);

        List<Product> productList = Arrays.asList(p1,p2,p3,p4,p5);

        Store store = new Store(productList);

        assertEquals(1, store.getProductByCategoryName(f));
    }
}

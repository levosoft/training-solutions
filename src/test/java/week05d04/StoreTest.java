package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    void test1(){

        //Given
        Store store = new Store();

        Product product1 = new Product("Danone epres joghurt", 2020, 6, 15);
        Product product2 = new Product("Milli vaníliás krémtúró", 2020, 12, 8);
        Product product3 = new Product("Müllermilch fahéjas tejberizs", 2020, 12, 20);
        Product product4 = new Product("Maresi kávétejszín", 2019, 11, 10);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);

        //When
        int x = store.getNumberOfExpired();

        //Then
        assertEquals(2, x);

    }

    @Test
    void test2(){

        //Given
        Store store = new Store();

        Product product2 = new Product("Milli vaníliás krémtúró", 2020, 12, 8);
        Product product3 = new Product("Müllermilch fahéjas tejberizs", 2020, 12, 20);

        store.addProduct(product2);
        store.addProduct(product3);

        //When
        int x = store.getNumberOfExpired();

        //Then
        assertEquals(0, x);

    }

    @Test
    void test3(){

        //Given
        Store store = new Store();

        Product product1 = new Product("Danone epres joghurt", 2020, 6, 15);
        Product product4 = new Product("Maresi kávétejszín", 2019, 11, 10);

        store.addProduct(product1);
        store.addProduct(product4);

        //When
        int x = store.getNumberOfExpired();

        //Then
        assertEquals(2, x);

    }

    @Test
    void test4(){

        //Given
        Store store = new Store();

        Product product1 = new Product("Danone epres joghurt", 2020, 6, 15);
        Product product2 = new Product("Milli vaníliás krémtúró", 2020, 12, 8);

        store.addProduct(product1);
        store.addProduct(product2);

        //When
        int x = store.getNumberOfExpired();

        //Then
        assertEquals(1, x);

    }
}

package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathAlgorithmsTest {

    @Test
    public void test1(){
        assertEquals(MathAlgorithms.isPrime(4), false);
    }

    @Test
    public void test2(){
        assertEquals(MathAlgorithms.isPrime(11), true);
    }

    @Test
    void test3(){

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            MathAlgorithms.isPrime(-11);
        });

        assertEquals("Negatív paraméter!", ex.getMessage());
    }
}

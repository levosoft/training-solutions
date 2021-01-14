package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {

    @Test
    public void test1(){
        MathAlgorithms ma = new MathAlgorithms();

        assertEquals(4, ma.greatestCommonDivisor(12, 16));
    }

    @Test
    public void test2(){
        MathAlgorithms ma = new MathAlgorithms();

        assertEquals(25, ma.greatestCommonDivisor(100, 50));
    }
}

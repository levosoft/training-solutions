package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void test1(){

        Calculator c = new Calculator();
        int[] testArray = {6, 2, 1, 9, 3, 13, 4};

        assertEquals(10, c.findMinSum(testArray));
    }
}

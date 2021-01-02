package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumTest {

    @Test
    public void test1(){
        DigitSum ds = new DigitSum();

        assertEquals(ds.sumOfDigits(123), 6);
    }
}

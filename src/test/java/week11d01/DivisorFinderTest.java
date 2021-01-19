package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisorFinderTest {

    @Test
    public void test1(){

        DivisorFinder df = new DivisorFinder();

        assertEquals(2, df.findDivisors(246));
    }
}

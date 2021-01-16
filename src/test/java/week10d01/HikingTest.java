package week10d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HikingTest {

    @Test
    public void test1(){

        Hiking h = new Hiking();

        assertEquals(3.5, h.getPlusElevation(Arrays.asList(3.0, 4.5, 5.5, 1.5, 2.5)));
    }
}

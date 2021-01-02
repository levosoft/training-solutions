package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberListTest {

    @Test
    public void test1(){

        NumberList nl = new NumberList();
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7);

        assertEquals(nl.isIncreasing(myList), true);
    }

    @Test
    public void test2(){
        NumberList nl = new NumberList();
        List<Integer> myList = Arrays.asList(3, 2, 1, 6, 5, 4, 3, 1);

        assertEquals(nl.isIncreasing(myList), false);
    }
}

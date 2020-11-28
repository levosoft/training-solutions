package week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ListCounterTest {

    @Test
    void test1(){

        //Given
        ListCounter lc = new ListCounter();
        List<String> myList = Arrays.asList("almalé", "jégkocka", "Coca Cola", "Aperol Spritz", "mentalevél", "alkoholmentes sör", "Jack Daniels");

        //When
        int x = lc.counter(myList);

        //Then
        assertEquals(3, x);
    }
}

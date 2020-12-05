package week06d01;

import org.junit.jupiter.api.Test;
import week05d05.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {

    @Test
    void test1(){
        ListSelector ls = new ListSelector();

        List<String> myList = Arrays.asList("a", "ab", "abc", "abcd", "abcde");

        assertEquals("[aabcabcde]", ls.myStringBuilder(myList));

    }

    @Test
    void test2(){
        ListSelector ls = new ListSelector();
        List<String> myFalseList = new ArrayList<>();

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            ls.myStringBuilder(myFalseList);
        });

        assertEquals("Üres lista!", ex.getMessage());
    }
}

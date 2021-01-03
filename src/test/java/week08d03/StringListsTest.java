package week08d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    @Test
    public void test1(){

        StringLists stringLists = new StringLists();

        List<String> first = Arrays.asList("cica", "kutyus", "maci");
        List<String> second = Arrays.asList("egérke", "malac", "nyuszi");
        List<String> reference = Arrays.asList("cica", "kutyus", "maci", "egérke", "malac", "nyuszi");

        assertEquals(stringLists.stringListsUnion(first, second), reference);
    }

    @Test
    public void test2(){

        StringLists stringLists = new StringLists();

        List<String> first = Arrays.asList("cica", "kutyus", "maci", "malac");
        List<String> second = Arrays.asList("egérke", "malac", "kutyus", "nyuszi");
        List<String> reference = Arrays.asList("cica", "kutyus", "maci", "malac", "egérke", "nyuszi");

        assertEquals(stringLists.stringListsUnion(first, second), reference);
    }
}

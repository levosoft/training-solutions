package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFilterTest {

    @Test
    public void test1(){
        WordFilter wf = new WordFilter();
        List<String> testList = new ArrayList<>();
        testList = wf.wordsWithChar(Arrays.asList("kutyus", "cica", "strucc", "malac", "elefánt", "papagáj"), 'a');

        assertEquals(Arrays.asList("cica", "malac", "papagáj"), testList);
    }

    @Test
    public void test2(){
        WordFilter wf = new WordFilter();
        List<String> testList = new ArrayList<>();
        testList = wf.wordsWithChar(Arrays.asList("Volvo", "Mercedes", "Suzuki", "Volkswagen", "Maserati", "BMW"), 'w');        //Beugratós a nagy W!

        assertEquals(Arrays.asList("Volkswagen"), testList);
    }

}

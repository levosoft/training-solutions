package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
    void test1(){
        WordEraser myWordEraser = new WordEraser();
        String testedString = myWordEraser.eraseWord("alma alma körte alma alma", "körte");

        assertEquals("alma alma alma alma", testedString);
    }
}

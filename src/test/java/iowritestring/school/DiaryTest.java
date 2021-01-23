package iowritestring.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {

    @Test
    public void test1(){
        Diary d = new Diary();

        assertEquals(3.0, d.average());
    }
}

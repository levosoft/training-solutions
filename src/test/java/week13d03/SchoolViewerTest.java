package week13d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolViewerTest {

    @Test
    public void test1(){

        SchoolViewer sw = new SchoolViewer();
        //System.out.println(sw.lessonNumByTeacher("Csincsilla Csilla"));
        assertEquals(22, sw.lessonNumByTeacher("Csincsilla Csilla"));
    }
}

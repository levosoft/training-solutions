package week13d03;

import org.junit.jupiter.api.Test;

public class SchoolViewerTest {

    @Test
    public void test1(){

        SchoolViewer sw = new SchoolViewer();
        System.out.println(sw.lessonNumByTeacher("Csincsilla Csilla"));
    }
}

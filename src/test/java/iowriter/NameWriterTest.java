package iowriter;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

public class NameWriterTest {

    @Test
    public void test1(){

        Path file = Path.of("names.txt");
        NameWriter nw = new NameWriter(file);

        nw.addAndWrite("John Doe");
    }

    @Test
    public void test2(){

        Path file = Path.of("names.txt");
        NameWriter nw = new NameWriter(file);

        nw.addAndWrite("Jane Doe");
    }
}

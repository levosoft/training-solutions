package ioreadstring;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileManagerTest {

    @Test
    public void test1(){

        FileManager fm = new FileManager();
        List<Human> humans = new ArrayList<>();

        humans = fm.readFromFile();

        assertEquals("Linda", humans.get(1).getForename());
    }

    @Test
    public void test2(){

        FileManager fm = new FileManager();
        List<Human> humans = new ArrayList<>();

        humans = fm.readFromFile();

        assertEquals("Jovovich", humans.get(3).getLastname());
    }

    @Test
    public void test3(){

        FileManager fm = new FileManager();
        List<Human> humans = new ArrayList<>();

        humans = fm.readFromFile();

        assertEquals("Jovovich", humans.get(3).getLastname());
    }
}

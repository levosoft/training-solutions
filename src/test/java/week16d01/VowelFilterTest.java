package week16d01;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VowelFilterTest {

    @Test
    public void test1(){

        Path file = Path.of("vowelfilterfile.txt");
        VowelFilter vf = new VowelFilter();

        try {
            System.out.println(vf.filterVowels(Files.newBufferedReader(file)));;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

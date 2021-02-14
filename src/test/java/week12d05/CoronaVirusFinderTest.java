package week12d05;

import org.junit.jupiter.api.Test;

public class CoronaVirusFinderTest {

    @Test
    public void test1(){
        CoronaVirusFinder cvf = new CoronaVirusFinder();
        int coronacount = cvf.coronaCounter();
        System.out.println(coronacount);
    }
}

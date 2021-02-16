package week13d01;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CityStatisticTest {

    @Test
    public void test1(){



        CityStatistic cs = new CityStatistic();
        System.out.println(cs.getLongestCityName(new BufferedReader(new InputStreamReader(CityStatistic.class.getResourceAsStream("iranyitoszamok-varosok-2021.csv")))));
    }
}

package week08d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lottery {

    /*
    * Készíts a week08d02 csomagban egy Lottery osztályt, melynek legyen egy getNumbers() metódusa, ami visszaad egy listát amiben 5 véletlen szám van 1-90 között,
    * tehát kvázi készíts egy lottósorsoló programot. A sorrendre nem kell figyelni, a lényeg, hogy a számok különbözők legyenek!*/

    private int first = 0;
    private int second = 0;
    private int third = 0;
    private int fourth = 0;
    private int fifth = 0;

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }

    public int getFourth() {
        return fourth;
    }

    public int getFifth() {
        return fifth;
    }

    public List getNumbers(){

        Random random = new Random();

        //Első szám
        first = getRandomNumberInRange(1,90);

        //Második szám
        do {
            second = getRandomNumberInRange(1,90);
        }
        while (second == first);

        //Harmadik szám
        do {
            third = getRandomNumberInRange(1,90);
        }
        while ((third == first) && (third == second));

        //Negyedik szám
        do {
            fourth = getRandomNumberInRange(1,90);
        }
        while ((fourth == first) && (fourth == second) && (fourth == third));

        //Ötödik szám
        do {
            fifth = getRandomNumberInRange(1,90);
        }
        while ((fifth == first) && (fifth == second) && (fifth == third) && (fifth == fourth));

        List<Integer> winnerNumbers = Arrays.asList(first, second, third, fourth, fifth);

        return winnerNumbers;

    }


    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max kisebb min-nél!");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}

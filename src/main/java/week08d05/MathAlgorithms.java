package week08d05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MathAlgorithms {

    /*
    * A week08d05 csomagban készíts egy osztályt MathAlgorithms néven.
    * Legyen benne egy metódus, greatestCommonDivisor(), ami paraméterül vár két pozitív egész számot és visszaadja a legnagyobb közös
    * osztójukat.*/

    public int greatestCommonDivisor(int a, int b){

        List<Integer> divisorsA = new ArrayList<>();
        List<Integer> divisorsB = new ArrayList<>();
        List<Integer> divisorsCommon = new ArrayList<>();


        for (int i = 1; i < a; i++) {
            if(a%i == 0){
                divisorsA.add(i);
            }
        }

        for (int i = 1; i < b; i++) {
            if(b%i == 0){
                divisorsB.add(i);
            }
        }

        if(divisorsA.size() < divisorsB.size()){
            for (int i: divisorsB){
                if(divisorsA.contains(i)){
                    divisorsCommon.add(i);
                }
            }
        }else{
            for (int i: divisorsA){
                if(divisorsB.contains(i)){
                    divisorsCommon.add(i);
                }
            }
        }

        int greatestCommonDivisor = Collections.max(divisorsCommon);
        return greatestCommonDivisor;
    }
}

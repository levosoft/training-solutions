package week10d02;

import java.util.List;

public class MaxTravel {

    //Feladat röviden: Meg kell keresni, hogy a paraméterül kapott tömbben (listában) melyik elem szerepel a legtöbbször!


    public int getMaxIndex(List<Integer> integerList){
        int result = 0;
        int max = 0;

        int[] integerArray = new int[30];       //30 elemű integer tömb deklarálása

        for (int item: integerList){
            integerArray[item] ++;              //A tömb feltöltése ciklusban a paraméterlista elemein végig iterálva
        }

        //Megkeresem a legnagyobb szám indexét
        for (int i = 0; i < integerArray.length; i++) {
            if(integerArray[i] > max){
                max = integerArray[i];
                result = i;
            }
        }
        return result;
    }
}

package week07d03;

import java.util.List;

public class NumberList {

    /*
    * Hozz létre egy NumberList osztályt! Ennek legyen egy metódusa isIncreasing(List<Integer>), mely egy számokból álló listát vár paraméterül és megnézi,
    * hogy a listában a számok növekvő sorrendben szerepelnek-e és ennek megfelelően igaz vagy hamis értékkel tér vissza! Speciális eset ha két egymást követő szám egyenlő,
    * ez nem probléma a 1, 2, 3, 3, 3, 5 számokat növekvőnek tekintjük.*/

    public boolean isIncreasing(List<Integer> integerList){

        boolean incr = false;

        for (int i = 0; i < integerList.size()-1; i++) {
            if(integerList.get(i) < integerList.get(i+1)){
                incr = true;
            }else if(integerList.get(i) == integerList.get(i+1)){
                incr = true;
            }else{
                incr = false;
            }
        }
        return incr;
    }
}

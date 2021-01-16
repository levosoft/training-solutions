package week10d01;

import java.util.List;

public class Hiking {

    /*
    * Túrázás közben egy GPS eszköz rögzíti a pontokat. Eltárolja a GPS koordinátákat, valamint a magasságot (mindegyik lebegőpontos érték).
    * Írj a week10d01.Hiking osztályba egy getPlusElevation() metódust, mely megkapja a magasságok listáját, és visszaadja a emelkedések összegét.
    * Azaz pl. 10,20,15,18 esetén 13, ugyanis (20 - 10) + (18 - 15). A 20 méterről 15 méterre ereszkedést nem számolja bele, hiszen az ereszkedés, és nem emelkedés.*/

    public double getPlusElevation(List<Double> elevations){

        double result = 0.0;
        double actual;
        double previous;

        for (int i = 1; i < elevations.size(); i++) {
            actual = elevations.get(i);
            previous = elevations.get(i-1);

            if(actual > previous){
                result += actual - previous;
            }
        }
        return result;
    }
}

package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    /*Készíts az egy Budget osztályt, amely a konstruktorában Item példányokat vár listában (List).
    Az Item tartalmazza az alábbi attribútumokat: int price, int month, String name. A Budget osztály tárolja el egy attribútumban a konstruktorban megkapott items listát.
    Írj egy metódust, getItemsByMonth néven, mely egy hónapot vár (1-12) és visszaadja az Item-eket az adott hónapban! Bónusz feladat: ellenőrizzük a bemeneti paramétereket!*/

    private List<Item> myList;

    public Budget(List<Item> myList) {
        this.myList = myList;
    }

    public List<Item> getItemsByMonth(int month){

        List<Item> selectedItems = new ArrayList<>();

        for (Item item: myList){
            if(item.getMonth() == month){
                selectedItems.add(item);
            }
        }
        return selectedItems;
    }
}

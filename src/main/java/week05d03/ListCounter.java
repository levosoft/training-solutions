package week05d03;

import java.util.List;

public class ListCounter {

    /*
    Írj egy olyan metódust az week05d03.ListCounter osztályban, mely egy kapott Listából (String) összeszámolja azokat amik 'a' vagy 'A' betűvel kezdődnek,
    Ha nulla elemű a tömb,vagy nincs benne ilyen elem, akkor 0-t adjon vissza.
    */

    public int counter(List<String> list){
        int listCount = 0;

        if(list.size() == 0){
            return listCount;
        }else{
            for(String item : list){
                if (item.startsWith("a") || item.startsWith("A")){
                    listCount++;
                }
            }
            return listCount;
        }
    }
}

package week05d03;

import java.util.List;

public class ListCounter {

    public int counter(List<String> list){
        int listCount = 0;

        for(String item : list){
            if (item.startsWith("a") || item.startsWith("A")){
                listCount++;
            }
        }

        return listCount;
    }
}

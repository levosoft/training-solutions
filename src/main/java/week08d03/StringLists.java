package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    /*
    Készíts week08d03 csomagban egy StringLists osztályt és benne egy stringListsUnion(List<String> first, List<String> second) metódust,
    mely két string listát vár paraméterül és visszaadja az uniójukat. Az úniónak minden elemet tartalmaznia kell mindkét listából, de egy elem nem szerepelhet kétszer!
     */

    public List<String> stringListsUnion(List<String> first, List<String> second){

        List<String> union = new ArrayList<>();

        for (String item: first){
            union.add(item);
        }

        for (String item: second){
            if(!union.contains(item)){
                union.add(item);
            }
        }

        return union;
    }
}

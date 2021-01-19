package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    /*Készíts egy WordFilter osztályt, melyben van egy List<String> wordsWithChar(List<String> words, char c) metódus.
    A metódus kiválogatja a paraméterül kapott String listából azokat a szavakat, melyekben előfordul a c karakter, majd ezeket visszaadja egy listában.*/

    public List<String> wordsWithChar(List<String> words, char c){

        List<String> resultList = new ArrayList<>();

        for (String item : words){
            if(item.contains(Character.toString(c))){
                resultList.add(item);
            }
        }

        return resultList;
    }
}

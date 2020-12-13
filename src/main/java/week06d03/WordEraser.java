package week06d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordEraser {
    /*A WordEraser osztályban legyen egy eraseWord(String words, String word) metódus, mely az első paraméter szöveget úgy változtatja meg,
    hogy a második paraméter összes előforulását kitörli belőle. A words paraméterben a szavak szóközzel vannak elválasztva.
    A metódus térjen vissza a törölni kívánt szavak nélküli Stringgel. (Mellőzzük a replace és replaceAll használatát!)*/

    public String eraseWord(String words, String word){

        List<String> wordsArray = Arrays.asList(words.split(" "));
        StringBuilder sb = new StringBuilder();

        for (String item : wordsArray){
            if(item.equals(word)){

            }else{
                sb.append(item + " ");
            }
        }
        return sb.toString().trim();
    }

}

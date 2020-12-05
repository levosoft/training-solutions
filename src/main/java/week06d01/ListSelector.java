package week06d01;

import java.util.List;

public class ListSelector {

    public String myStringBuilder (List<String> stringList){

        if (stringList.isEmpty()){
            throw new IllegalArgumentException("Üres lista!");
        }else {
            StringBuilder myStringBuilder = new StringBuilder();
            String myString = "";
            for (int i = 0; i < stringList.size(); i++) {
                if (i%2 == 0){
                    myStringBuilder.append(stringList.get(i));
                }
            }
            myString = "[" + myStringBuilder.toString() + "]";
            return myString;
        }
    }
}

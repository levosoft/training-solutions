package week06d01;

import java.util.List;

public class ListSelector {
    /*
    Írj egy olyan metódust az week06d01.ListSelector osztályban, mely egy kapott listából minden második elemet kiválogat, és egy szövegként összerak, szögletes zárójelek között.
    A páros megállapítása index szerint működik. Azaz az első, nulla indexű elem páros, a második, azaz egyes indexű elem páratlan, stb.
    Ha üres a lista, akkor üres stringet adjunk vissza. Ha a paraméterül kapott lista null, akkor dobjunk IllegalArgumentExceptiont a metódusban.
    */

    public String myStringBuilder (List<String> stringList){

        if (stringList == null){
            throw new IllegalArgumentException("Null!");
        }else {
            if(stringList.isEmpty()){
                return "";
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
}

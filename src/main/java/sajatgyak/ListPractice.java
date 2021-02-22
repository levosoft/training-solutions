package sajatgyak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        List<String> myList1 = Arrays.asList("alma", "körte", "szilva");
        List<String> myList2 = List.of("barack", "málna", "meggy");         //Ez a korszerűbb (JAVA 9-óta)

        System.out.println(myList1);
        System.out.println(myList2);
    }
}

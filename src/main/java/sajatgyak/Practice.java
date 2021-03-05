package sajatgyak;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        //Lista rendezése ABC-sorrendben (helyi beállításoknak megfelelően)
        List<String> nevek = Arrays.asList("Cecil", "Ádám", "Béla");
        Collections.sort(nevek, Collator.getInstance());
        System.out.println(nevek);




    }

}

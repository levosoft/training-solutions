package sajatgyak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        //Lista rendezése ABC-sorrendben (helyi beállításoknak megfelelően)
        List<String> nevek = Arrays.asList("Cecil", "Ádám", "Béla");
        Collections.sort(nevek, Collator.getInstance());
        System.out.println(nevek);

        //Fájl beolvasás Classpath-ról (resources/package)
        BufferedReader reader = new BufferedReader(new InputStreamReader(Practice.class.getResourceAsStream("myFile.txt")));
        System.out.println(new Practice().getReader(reader));

    }

    //File olvasása soronként - Paraméter reader!
    public List<String> getReader(BufferedReader reader) {

        List<String> myList = new ArrayList<>();
        String id;
        String line;

        try(reader){
            while ((line = reader.readLine()) != null){
                if(line.contains("ID")){
                    String[] datas = line.split(":");
                    myList.add(datas[1]);
                }
            }
            return myList;
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

}

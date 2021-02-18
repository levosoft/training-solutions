package week16d01.histogram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class VowelFilter {

    /*Írj egy VowelFilter.filterFowels(BufferedReader reader) metódust, mely beolvas egy
    fájlt soronként, kiszűri belőle a magánhangzókat, és visszaadja egy String-ként.*/

    private Path file2 = Path.of("vowelfilteredfile.txt");

    public String filterVowels(BufferedReader reader){

        List<Character> vowels = List.of('a','A','á','Á','e','E','é','É','i','I','í','Í','o','O','ó','Ó','ö','Ő','u','U','ú','Ú','ü','Ü');

        try (reader) {

            String line;
            String letter = "";
            StringWriter sw = new StringWriter();

            while((line = reader.readLine()) != null) {
                for (Character c: line.toCharArray()) {
                    if(vowels.contains(c)){
                        //line = line.replace(c.toString(), "");
                        letter = "";
                    }else{
                        letter = c.toString();
                    }

                    try (sw) {
                        sw.write(letter);
                    }
                    catch (IOException ioe) {
                        throw new IllegalStateException("Can not write", ioe);
                    }
                }
                sw.write("\n");
            }
            return sw.toString();
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}

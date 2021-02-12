package iostringwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {

    /*A feladatban hosszú szavakat kell kezelned StringWriter segítségével.
    Írj egy metódust, ami egy Writer-t és egy listát kap paraméterül, és minden lista beli elem után írja a szó hosszát!
    Majd írj egy metódust, ami csak egy listát vár, és az előzőleg megírt metódust használja a paraméterül kapott listával és egy példányosított StringWriter-rel*/

    public void wordLenghtWriter(Writer writer, List<String> words){

        PrintWriter pw = new PrintWriter(writer);

        for (String word : words){
            pw.print(word);
            pw.print(": ");
            pw.print(word.length());
        }
    }

    public String useStringWriter(List<String> words){

        StringWriter sw = new StringWriter();

        try (sw) {
            wordLenghtWriter(sw, words);
            return sw.toString();
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
    }


}

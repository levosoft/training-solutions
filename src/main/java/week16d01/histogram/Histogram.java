package week16d01.histogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringWriter;

/*Olvass be egy szöveges fájlt soronként, melyben soronkont számok vannak. Majd hozz létre egy stringet, mely ugyanennyi sort tartalmaz, és annyi csillagot ír ki
    egymás mellé soronkont, amennyi a bemeneti fájlban lévő szám.

    Azaz a bemeneti fájl:
    3
    4
    1
    2

    A létrehozott String:
    ***
    ****
    *
    **
    Figyelj, hogy az algoritmusod lehetőleg hatékony legyen!

    A Histogram osztályba dolgozz, tesztje HistogramTest. Minden sor után legyen sortörés, az utolsó után is.*/

public class Histogram {
    public static final String STAR_CHARACTER = "*";
    public static final String LINE_BREAK = "\n";

    public String createHistogram(BufferedReader reader){

        int x;
        StringBuilder sb = new StringBuilder();

        String line;
        try(reader){
            while ((line = reader.readLine()) != null){
                x = Integer.parseInt(line);

                sb.append(STAR_CHARACTER.repeat(x));
                sb.append(LINE_BREAK);
            }
            return sb.toString();
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}

package week16d01.histogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringWriter;

public class Histogram {

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

    public String createHistogram(BufferedReader reader){

        int x;
        String newLine = "";
        StringWriter writer = new StringWriter();

        String line;
        try(reader){
            while ((line = reader.readLine()) != null){
                x = Integer.parseInt(line);

                switch (x){
                    case 0:
                        newLine = "\n";
                        break;
                    case 1:
                        newLine = "*\n";
                        break;
                    case 2:
                        newLine = "**\n";
                        break;
                    case 3:
                        newLine = "***\n";
                        break;
                    case 4:
                        newLine = "****\n";
                        break;
                    case 5:
                        newLine = "*****\n";
                        break;
                    case 6:
                        newLine = "******\n";
                        break;
                    case 7:
                        newLine = "*******\n";
                        break;
                    case 8:
                        newLine = "********\n";
                        break;
                    case 9:
                        newLine = "*********\n";
                        break;
                    case 10:
                        newLine = "**********\n";
                        break;
                }

                writer.write(newLine);
            }
            return writer.toString();
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}

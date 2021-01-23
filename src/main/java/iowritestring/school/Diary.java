package iowritestring.school;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/*Ebben a feladatban egy iskolai naplózó rendszert kell megvalósítanod.
Készíts a school csomagban egy Diary nevű osztályt benne egy newMark() metódussal, ami paraméterül várja a tanuló nevét és egy jegyet!
Ha létezik a "tanulo_neve.txt" akkor a jegyet hozzáfűzi az állomány végére. Ha nem, akkor egy új állományt hoz létre "tanulo_neve.txt" formátumban, és beleírja a jegyet.
Azt, hogy létezik-e egy fájl a Files.exists(path) metódussal tudod eldönteni. A fájlok a src/main/resources/ könyvtárban legyenek!

Az év végén a tanár szeretné a tanuló fájl utolsó sorába az átlagot beírni. Írj egy metódust average() névvel, ami a fájl utolsó sorába a jegyek átlagát írja be!
Például "average: 5"
*/


public class Diary {

    private Path file = Path.of("tanulo_neve.txt");

    public void newMark(String name, int mark){
        if(Files.exists(file)){
            try{
                Files.writeString(file, name + ": " + mark + "\n", StandardOpenOption.APPEND);      //A létező fájl végére írok (új sorba)
            }catch (IOException ioe){
                throw new IllegalStateException("Can not write file", ioe);
            }
        }else{
            try{
                Files.writeString(file, name + ": " + mark+ "\n");                                  //Létrehozom a fájlt és beleírok
            }catch (IOException ioe){
                throw new IllegalStateException("Can not write file", ioe);
            }
        }
    }


    public double average(){

        double average = 0.0;
        String marksString = "";
        int marksInt = 0;
        int counter = 0;
        List<String> lines = new ArrayList<>();

        try{
            lines = Files.readAllLines(file, Charset.forName("UTF-8"));                                 //Soronként String Listába olvasom a fájlt

            for (String line: lines){
                marksString = line.substring(line.length()-1, line.length());                           //Vizsgálom a sor utolsó karakterét
                marksInt = Integer.parseInt(marksString);
                average += marksInt;
                counter++;
            }

            average = average / counter;

        }catch (IOException ioe){
            throw new IllegalStateException("Can not write file", ioe);
        }

        return average;
    }
}

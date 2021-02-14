package week12d05;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class CoronaVirusFinder {

    public int coronaCounter(){

        int coronaCount = 0;

        //Beolvasás ClassPath-ról
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(CoronaVirusFinder.class.getResourceAsStream("/index.html")))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                if (line.contains("koronavírus")){
                    coronaCount++;
                    }
                }
            }
        catch (IIOException ioe){
            throw new IllegalStateException("Can not read file!", ioe);
        }
        finally {
            return coronaCount;
        }

    }

}

package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owlMap = new HashMap<>();

    public void readFromFile(BufferedReader reader) {

        String line;
        try(reader){
            while ((line = reader.readLine()) != null){
                String[] datas = line.split("=");
                owlMap.put(datas[0], Integer.parseInt(datas[1]));
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file!", ioe);
        }

    }

    public int getNumberOfOwls(String s) {
        return owlMap.get(s);
    }
}

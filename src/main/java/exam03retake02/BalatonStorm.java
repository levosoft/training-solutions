package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BalatonStorm {

    public List<String> getStationsInStorm(BufferedReader reader) {

        List<String> stationList = new ArrayList<>();
        String station = "";
        String line;

        try(reader){
            while ((line = reader.readLine()) != null){
                if(line.contains("allomas")){
                    station = line.substring(16,line.length()-2);
                }
                if (line.contains("level")){
                    int level = Integer.parseInt(line.substring(13,14));
                    if(level == 3){
                        stationList.add(station);
                    }
                }
            }
            Collections.sort(stationList);
            return stationList;
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}

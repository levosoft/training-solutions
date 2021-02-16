package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

public class CityStatistic {

    public String getLongestCityName(BufferedReader reader){

        String line;
        String[] cityDatas = {"", "", ""};;
        int temporarySize = 0;
        String temporaryCityName = "";
        int cityNameSize = 0;
        String longestCityName = "";

        try(reader){
            while ((line = reader.readLine()) != null){
                Arrays.fill(cityDatas, null);
                cityDatas = line.split(";");
                temporaryCityName = cityDatas[1];
                temporarySize = temporaryCityName.trim().length();

                if (temporarySize > cityNameSize){
                    cityNameSize = temporarySize;
                    longestCityName = temporaryCityName;
                }
            }
            return longestCityName;
        }
        catch(IOException ioe){
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}

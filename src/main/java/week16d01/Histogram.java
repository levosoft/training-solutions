package week16d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringWriter;

public class Histogram {

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

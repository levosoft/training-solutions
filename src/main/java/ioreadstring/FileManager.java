package ioreadstring;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path file = Path.of("humans.txt");


    public List<Human> readFromFile(){

        List<Human> humans = new ArrayList<>();
        List<String> fullNames = new ArrayList<>();

        try {
            fullNames = Files.readAllLines(file, Charset.forName("UTF-8"));

            for (String fullName : fullNames){
                String name[] = fullName.split(" ");

                humans.add(new Human(name[0], name[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return humans;

    }

}

package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolViewer {

    /*A fájl tantárgyfelosztást tartalmaz. A tanttárgyfelosztást 4-es blokkokban adjuk meg.
    Első sor a tanár neve, majd a tantárgy, majd az osztály ahol tanítja és végül az, hogy heti hány órában.
    Írj egy metódust, ami paraméterül várja egy tanár nevét, és kiírja, hogy hány órája van egy héten.*/

    private List<School> schools = new ArrayList<>();

    public void schoolReaderIntoList() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(SchoolViewer.class.getResourceAsStream("beosztas.txt")));

        int linecounter = 1;
        String line;

        String teacher = "";
        String subj = "";
        String clas = "";
        int hours = 0;

        try(reader) {
            while ((line = reader.readLine()) != null){
                switch (linecounter){
                    case 1:
                        teacher = line;
                        break;
                    case 2:
                        subj = line;
                        break;
                    case 3:
                        clas = line;
                        break;
                    case 4:
                        hours = Integer.parseInt(line);
                        schools.add(new School(teacher,subj,clas,hours));
                        linecounter = 0;
                        break;
                }
                linecounter++;
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    public int lessonNumByTeacher(String searchedTeacher){

        schoolReaderIntoList();

        int sum = 0;
        for (School school : schools) {
            if(school.getTeacher().equals(searchedTeacher)){
                sum += school.getHours();
            }
        }
        return sum;
    }

}

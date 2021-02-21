package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/*Írj egy a TemplateMerger osztályba egy public String merge(Path file, List<Employee> employees) metódust, ami felolvassa a fájlt, melynek tartalma:

Az alkalmazott neve: {nev}, születési éve: {ev}
Nyugodtan beolvashatod egy utasítással!

Majd a visszatérési értékként add vissza soronként az alkalmazottakat, abban a formátumban, mint ahogy a fájlban van, azaz:

Az alkalmazott neve: John Doe, születési éve: 1980
Az alkalmazott neve: Jack Doe, születési éve: 1990
(Persze ehhez kell egy Employee osztály is a megfelelő attribútumokkal.*/


public class TemplateMerger {

    private String sablon = "";
    StringBuilder sb = new StringBuilder();

    public String merge(Path file, List<Employee> employees){

        try {
            sablon = Files.readString(file);
            System.out.println(employees);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        for (Employee e : employees){
            sb.append(sablon.replace("{nev}", e.getName()).replace("{ev}", e.getYearOfBirth()));
            sb.append("\n");
        }

        return sb.toString();

    }

}

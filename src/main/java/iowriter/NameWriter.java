package iowriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NameWriter {

    /* A feladatban egyszerűen neveket fogunk eltárolni fájlban és listában egyaránt. A NameWriter osztály konstruktorban megkapja az írni kívánt fájlt.
    Az addAndWrite() metódus egy nevet vár paraméterül, amelyet hozzáfűzi a fájlhoz.
    A hozzáfűzéshez használd a korábban megismert StandardOpenOption.Append paramétert a newBufferedWriter() metódusban.*/

    private Path file = null;

    public NameWriter(Path file) {
        this.file = file;
    }


    public void addAndWrite(String name){
        if(Files.exists(file)){
            try {
                BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.APPEND);   //A létező fájl végére írok (új sorba)
                writer.write(name + "\n");                                                      //Nem írja be az átadott Stringet?!
            }
            catch (IOException ioe) {
                throw new IllegalStateException("Can not write file", ioe);
            }
        }else{
            try{
                BufferedWriter writer = Files.newBufferedWriter(file);                              //Létrehozom a fájlt és beleírok
                writer.write(name + "\n");                                                      //Nem írja be az átadott Stringet?!
            }catch (IOException ioe){
                throw new IllegalStateException("Can not write file", ioe);
            }
        }
    }


    //A megadott megoldás NoSuchFileException kivételt dob!
    /*
    public void addAndWrite(String name){
        try (BufferedWriter bw = Files.newBufferedWriter(file, StandardOpenOption.APPEND)) {
            bw.write(name + "\n");
        } catch (IOException e) {
            throw new IllegalStateException("Can't open file!", e);
        }
    }*/
}

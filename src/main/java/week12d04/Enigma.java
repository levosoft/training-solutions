package week12d04;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Enigma {
    /*Töltsd le a példa bináris állomány a https://github.com/Training360/strukturavalto-java-public/raw/master/examples/week12d04/src/main/resources/secret.dat címről!
    Ez bájtokat tartalmaz, egy szöveg van titkosítva benne. Olvasd be bájtonként, és mindegyik bájthoz adjál hozzá tízet!
    Ez valójában egy karakterkód, ezt alakítsd át `char` típusú értékké!
    Majd egymás után írd ki ezeket a konzolra! Ne használj közöttük sortörést!*/

    public static void main(String[] args) {

        Path file = Path.of("secret.dat");

        try {
            byte[] bytes = Files.readAllBytes(file);
            char letter = ' ';

            for (byte b : bytes){
                b += 10;
                letter = (char)b;
                System.out.print(letter);
            }

        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }

}

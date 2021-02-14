package ioreadbytes;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {

    /*Ebben a feladatban egy mátrix adatszerkezettel kell dolgoznod. Hozz létre egy listát, ami byte tömbök tárolására alkalmas!
    Tárold el ebben a listában a matrix.dat állományból beolvasott, minden 1000 bájtot tartalmazó byte tömböt!
    Az állományban csak egyesek és nullák vannak. Írj egy metódust, ami visszaadja azon oszlopok számát, ahol több nulla, mint egyes van a mátrixban!*/


    private List<byte[]> myMatrix = new ArrayList<>();

    public List<byte[]> getMyMatrix() {
        return myMatrix;
    }

    public void readBytesAndCreateMatrix(String fileName){

        Path file = Path.of(fileName);

        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(file))) {
            byte[] bufferedBytes = new byte[1000];
            int size;
            while ((size = inputStream.read(bufferedBytes)) > 0) {
                myMatrix.add(bufferedBytes);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public int numberOfColumnsWhereMoreZeros(){

        int numOfColumns = 0;

        for (int i = 0; i < 1000; i++) {
            int numOfZeros = 0;
            int numOfOnes = 0;

            for (int j = 0; j < myMatrix.size(); j++) {
                if (myMatrix.get(j)[i] == 48){
                    numOfZeros++;
                }else {
                    numOfOnes++;
                }
            }

            if (numOfZeros > numOfOnes){
                numOfColumns++;
            }
        }

        return numOfColumns;
    }

}

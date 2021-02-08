package ioprintwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {

    /*Ebben a feladatban emberek fizetését kell meghatároznod titulus alapján.
    A SalaryWriter osztály konstruktorban kap egy név listát. A writeNamesAndSalaries(Path file) metódus kiírja a fájlba név: összeg formátumban.
     A fizetések a következő képpen alakulnak:
     - Ha tartalmazza a név a "Dr" előtagot, akkor 500000
     - Ha a "Mr" vagy "Mrs" előtagot akkor 200000
     - Különben 100000 */


    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path file){
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))){
            for (String name : names){
                if(name.startsWith("Dr")){
                    pw.print(name);
                    pw.print(": ");
                    pw.println(500_000);
                }else if(name.startsWith("Mr") || name.startsWith("Mrs")){
                    pw.print(name);
                    pw.print(": ");
                    pw.println(200_000);
                }else{
                    pw.print(name);
                    pw.print(": ");
                    pw.println(100_000);
                }
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}

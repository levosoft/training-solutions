package week02d04;

import java.util.ArrayList;
import java.util.Scanner;

public class InputNames {

    /*Hozz létre egy InputNames Java osztályt, melynek van egy main metódusa. Ciklusban kérj be öt nevet!
    A neveket tárold el egy tömbben! Írd ki a tömb tartalmát, sortöréssel elválasztva (írd bele, hogy hanyadik elem - 1-től sorszámozva)!*/

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        String name;

        for (int i = 0; i < 5; i++) {
            System.out.println("Adj meg egy nevet:");

            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
            names.add(name);
        }

        for (int i = 0; i < names.size(); i ++) {
            System.out.println(names.get(i));
        }

    }
}

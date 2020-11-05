package week02;

import java.util.ArrayList;
import java.util.Scanner;

public class InputNames {



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

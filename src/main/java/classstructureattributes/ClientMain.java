package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Adja meg az adatait!");

        System.out.println("Név:");
        client.name = scanner1.nextLine();

        System.out.println("Születési év:");
        client.year = scanner2.nextInt();

        System.out.println("Cím:");
        client.address = scanner1.nextLine();

        System.out.println("A megadott adatok a következők:");
        System.out.println("Név: " + client.name);
        System.out.println("Születési év: " + client.year);
        System.out.println("Cím: " + client.address);

    }
}

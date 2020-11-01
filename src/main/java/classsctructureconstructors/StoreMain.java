package classsctructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Store store1 = new Store("nyári gumiabroncs");
        Store store2 = new Store("mirelit hasábburgonya");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Store1, kérem a betárolandó mennyiséget:");
        System.out.println("Store1 aktuális mennyiség: " + store1.store(scanner.nextInt()));

        System.out.println("Store1, kérem a kitárolandó mennyiséget:");
        System.out.println("Store1 aktuális mennyiség: " + store1.dispatch(scanner.nextInt()));

        System.out.println("Store2, kérem a betárolandó mennyiséget:");
        System.out.println("Store2 aktuális mennyiség: " + store2.store(scanner.nextInt()));

        System.out.println("Store2, kérem a kitárolandó mennyiséget:");
        System.out.println("Store2 aktuális mennyiség: " + store2.dispatch(scanner.nextInt()));
    }
}

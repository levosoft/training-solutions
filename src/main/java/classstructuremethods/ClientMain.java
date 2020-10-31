package classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    /*
        Hozz létre egy Client osztályt, melynek három private attribútuma van: név (name), születési év (year) és cím (address).
        Típusaik rendre String, int és String!
        Mind a három attribútumra legyen lekérdező és módosító metódus! Legyen egy public void migrate(String address) metódusa is,
        mely az ügyfél elköltözését implementálja, valójában beállítja a tárolt címet az új, paraméterként átadott címre.
        Hozz létre egy main() metódust egy ClientMain osztályban, amelyben kipróbálod az osztály működését!
        Példányosítani kell egy objektumot a Client osztály alapján, majd be kell állítani az attribútumai értékét.
        Írd ki konzolra az összes adatát, majd hívd meg a migrate() metódust egy másik címmel!
        Jelezd vissza a felhasználónak a címváltozás sikerességét úgy, hogy kiírod az eltárolt új címet!
    */

    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Fekete Mercédesz");
        client.setYear(1990);
        client.setAddress("1111 Budapest, Minta u. 1.");

        System.out.println("Az ügyfél adatai:");
        System.out.println("Név: " + client.getName());
        System.out.println("Születési év: " + client.getYear());
        System.out.println("Lakcím: " + client.getAddress());

        System.out.println("Add meg az ügyfél új címét: ");
        Scanner scanner = new Scanner(System.in);
        client.migrate(scanner.nextLine());

        System.out.println("Az ügyfél új címe: " + client.getAddress());
    }
}

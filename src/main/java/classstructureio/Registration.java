package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A regisztrációhoz adj meg egy felhasználónevet és egy jelszót!");
        System.out.println("Felhasználónév:");
        String username = scanner.nextLine();
        System.out.println("Jelszó:");
        String password = scanner.nextLine();
        System.out.println("A következő adatokkal regisztráltál:");
        System.out.println("Felhasználónév: " + username);
        System.out.println("Jelszó: " + password);
    }
}

package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");

        int x = scanner.nextInt();

        if(x == 1){
            System.out.println("FELHASZNÁLÓK LISTÁZÁSA");
        }
        if(x == 2){
            System.out.println("FELHASZNÁLÓ FELVÉTELE");
        }


    }
}

package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a felhasználóneved:");
        String username = scanner.nextLine();

        System.out.println("Add meg a jelszavad:");
        String password1 = scanner.nextLine();

        System.out.println("Add meg a jelszavad mégegyszer:");
        String password2 = scanner.nextLine();

        System.out.println("Add meg az e-mail címed:");
        String email = scanner.nextLine();

        UserValidator uv = new UserValidator(username, password1, password2, email);

        System.out.println(uv.isValidUsername(uv.getUsername()) == true ? "Megfelelő felhasználónév" : "Nem megfelelő felhasználónév");
        System.out.println(uv.isValidPassword(uv.getPassword1(), uv.getPassword2()) == true ? "Megfelelő jelszó" : "Nem megfelelő jelszó");
        System.out.println(uv.isValidEmail(uv.getEmail()) == true ? "Megfelelő e-mail" : "Nem megfelelő e-mail");
    }
}

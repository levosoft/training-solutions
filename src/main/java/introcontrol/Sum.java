package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg 5 db számot:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        System.out.println(a+b+c+d+e);
    }*/
        for (int i = 4; i <= 10; i++) {
            if (i >= 7) {
                System.out.println(i / 2);
            } else {
                System.out.println(i * 2);
            }
        }
}
}

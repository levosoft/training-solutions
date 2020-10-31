package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Adj meg két egész számot:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("A két szám összege (" + a + " + " + b + ")=");
        System.out.println(a+b);
    }
}

package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a kedvenc számod adatait!");
        System.out.println("Előadó:");
        song.band = scanner.nextLine();
        System.out.println("Cím:");
        song.title = scanner.nextLine();
        System.out.println("Hossz (perc):");
        song.length = scanner.nextInt();

        System.out.println("A kedvenc számod adatai: Előadó: " + song.band + ", Cím: " + song.title + ", Hossz: " + song.length + " perc");
    }
}

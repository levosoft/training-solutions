package week02d02;

import java.util.Scanner;

public class Phone {
    /*Írj egy Phone osztályt, type (String) és mem (int) attribútumokkal! Generálj konstruktort, gettert és settert!
    Írj bele egy main metódust, amivel példányosítasz egy osztályt, és kiírod az attribútumok értékeit!*/

    private String type;
    private int mem;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a 1. telefon típusát: ");
        String type = scanner.nextLine();
        System.out.println("Add meg a 1. telefon memóriáját: ");
        int mem = scanner.nextInt();
        scanner.nextLine();

        Phone phone1 = new Phone(type, mem);


        System.out.println("Add meg a 2. telefon típusát: ");
        type = scanner.nextLine();
        System.out.println("Add meg a 2. telefon memóriáját: ");
        mem = scanner.nextInt();
        scanner.nextLine();

        Phone phone2 = new Phone(type, mem);

    }
}

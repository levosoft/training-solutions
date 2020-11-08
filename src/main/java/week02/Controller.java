package week02;

import java.util.Scanner;

public class Controller {
    private static Office office;


    public static void main(String[] args) {
        System.out.println("<<< OFFICE CONTROL SYSTEM >>>");
        System.out.println();

        readOffice();

    }

    public static void readOffice(){
        int numberOfMeetingrooms;
        String name;
        int width;
        int length;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg, hogy hány db tárgyalót szeretnél rögzíteni a rendszerben:");
        numberOfMeetingrooms = scanner.nextInt();
        System.out.println();
        office = new Office();

        for (int i = 0; i <= numberOfMeetingrooms; i++) {

            System.out.println("Add meg a tárgyaló nevét:");
            name = scanner.nextLine();

            System.out.println("Add meg a tárgyaló szélességét:");
            width = scanner.nextInt();
            System.out.println();

            System.out.println("Add meg a tárgyaló hosszát:");
            length = scanner.nextInt();
            System.out.println();

            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
            office.addMeetingRoom(meetingRoom);
        }

        printMenu();
    }

    public static void printMenu(){
        System.out.println("==================================");
        System.out.println("              MENÜ                ");
        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafele sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");
        System.out.println("==================================");

        runMenu();
    }

    public static void runMenu(){
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        System.out.println();

        if(nr == 1){
            office.printNames();
        }else if(nr == 2){
            office.printNamesReverse();
        }else if(nr == 3){
            office.printEvenNames();
        }else if(nr == 4){
            office.printAreas();
        }else if(nr == 5){
            System.out.println("Add meg a keresett nevet:");
            String name = scanner.nextLine();
            office.printMeetingRoomsWithName(name);
        }else if(nr == 6){
            System.out.println("Add meg a keresett névtöredéket:");
            String part = scanner.nextLine();
            office.printMeetingRoomsContains(part);
        }else if(nr == 7){
            System.out.println("Add meg a keresett területet:");
            int area = scanner.nextInt();
            System.out.println();
            office.printAreasLargerThan(area);
        }

        printMenu();
    }


}

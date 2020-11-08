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

            System.out.println("Add meg a tárgyaló nevét");
            name = scanner.nextLine();

            System.out.println("Add meg a tárgyaló szélességét");
            width = scanner.nextInt();
            System.out.println();

            System.out.println("Add meg a tárgyaló hosszát");
            length = scanner.nextInt();
            System.out.println();

            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
            office.addMeetingRoom(meetingRoom);
        }
    }


}

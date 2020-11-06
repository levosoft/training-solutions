package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Új belépő neve:");
        String name = scanner.nextLine();

        System.out.println("Születési éve:");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Születési hónapja:");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Születési napja:");
        int day = scanner.nextInt();
        scanner.nextLine();

        Employee newEmployee = new Employee(name, year, month, day);
        System.out.println("Az új belépő adatai: ");
        System.out.println("Név: " + newEmployee.getName() + ", Születési dátum: " + newEmployee.getDateOfBirth() + ", Belépés időpontja: " + newEmployee.getBeginEmployment());

    }
}

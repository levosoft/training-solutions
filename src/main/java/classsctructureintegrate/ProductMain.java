package classsctructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        String name;
        int price;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a termék nevét:");
        name = scanner.nextLine();
        System.out.println("Add meg a termék árát:");
        price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println("A termék neve: " + product.getName() + ", A termék ára: " + product.getPrice());

        System.out.println("Add meg az áremelkedés értékét: ");
        price = scanner.nextInt();
        product.increasePrice(price);
        System.out.println("A termék új növelt ára: " + product.getPrice());

        System.out.println("Add meg az árcsökkenés értékét: ");
        price = scanner.nextInt();
        product.decreasePrice(price);
        System.out.println("A termék új csökkentett ára: " + product.getPrice());
    }
}

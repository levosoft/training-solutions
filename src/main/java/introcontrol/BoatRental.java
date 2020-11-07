package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány fő bérel csónakot?");
        int x = scanner.nextInt();

        if(x == 1){
            System.out.println("A kétszemélyes csónakot vitte el, még 8 ember tud kievezni.");
        }else if(x == 2){
            System.out.println("A kétszemélyes csónakot vitték el, még 8 ember tud kievezni.");
        }else if(x == 3){
            System.out.println("A háromszemélyes csónakot vitték el, még 7 ember tud kievezni.");
        }else if(x == 4){
            System.out.println("Az ötszemélyes csónakot vitték el, még 5 ember tud kievezni.");
        }else if(x == 5){
            System.out.println("Az ötszemélyes csónakot vitték el, még 5 ember tud kievezni.");
        }else if (x == 6){
            System.out.println("Az ötszemélyes és a kétszemélyes csónakot vitték el, még 3 ember tud kievezni.");
        }else if (x == 7){
            System.out.println("Az ötszemélyes és a kétszemélyes csónakot vitték el, még 3 ember tud kievezni.");
        }else if (x == 8){
            System.out.println("Az ötszemélyes és a háromszemélyes csónakot vitték el, még 2 ember tud kievezni.");
        }else if (x == 9){
            System.out.println("Az összes csónakot kivitték, más már nem tud kölcsönözni.");
        }else if (x == 10){
            System.out.println("Az összes csónakot kivitték, más már nem tud kölcsönözni.");
        }else if (x > 10){
            System.out.println("Az összes csónakot kivitték, és még a parton is maradtak...");
        }

    }
}

package week10d05;

import java.util.Arrays;

public class Calculator {
    /*Készítsünk egy Calculator nevű osztályt, melynek van egy findMinSum(int[] arr) metódusa.
    A metódus feladata, hogy kiírja a legkisebb összegeket 4 számból, amiket lehetséges összerakni az arr tömb elemeiből.
    Példa: ha az arr tartalma [1, 3, 5, 7, 9], akkor a minimum összeg 1+3+5+7=16.

    Tehát a legisebb négy szám összegét kell visszaadnia!*/


    public int findMinSum(int[] arr){
        Arrays.sort(arr);

        int result = 0;

        for (int i = 0; i < 4; i++) {
            result += arr[i];
        }
        return result;
    }

}

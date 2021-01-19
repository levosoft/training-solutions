package week11d01;

public class DivisorFinder {

    /*Készítsünk egy DivisorFinder nevű osztályt, melynek van egy int findDivisors(int n) metódusa.
    A feladat az, hogy megnézzük a szám minden egyes számjegyére, hogy osztója-e a számnak, majd számoljuk össze őket.
    Példa: a 425-ben az 5 osztója a számnak, ezért a visszatérési érték 1.*/

    public int findDivisors(int n){
        int result = 0;
        int charToInt;

        String xString = Integer.toString(n);                   //Így lehet String-gé alakítani az Integer-t!!!

        for (int i = 0; i <= xString.length()-1; i++) {

            charToInt = xString.charAt(i) - '0';                //Így lehet int-té alakítani a char-t!!!

            if(n % charToInt == 0){
                result++;
            }
        }
        return result;
    }
}

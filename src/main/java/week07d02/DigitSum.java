package week07d02;

public class DigitSum {

    /*
    Készíts egy DigitSum osztályt és benne sumOfDigits(int x) metódus mely visszaadja a paraméterül kapott szám számjegyeinek összegét!
    pl.: 123 esetén a visszatérési érték 6.
    */

    private int result = 0;
    private int charToInt;

    public int sumOfDigits(int x){
        String xString = Integer.toString(x);

        for (int i = 0; i <= xString.length()-1; i++) {
            charToInt = xString.charAt(i) - '0';    //Így lehet int-té alakítani a char-t!!!
            result = result + charToInt;
        }
        return result;
    }
}

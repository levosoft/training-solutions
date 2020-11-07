package array;

public class ArrayMain {
    public static void main(String[] args) {
        //Definiálj egy String tömböt a hét napjaival! Írd ki a második elemét (kedd)! Írd ki a tömb hosszát is!
        String[] daysOfAWeek = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(daysOfAWeek[1]);
        System.out.println(daysOfAWeek.length);


        /*Definiálj egy öt elem hosszú int tömböt, és tárold le benne (ciklussal) a kettő hatványait (1, 2, 4, 8 stb.)!
        Ciklusban írd ki az értékeit!*/
        int[] a = new int[5];
        a[0] = 1;
        for (int i = 1; i < 5; i++) {
            a[i] = a[i - 1]*2;
        }
        for (int i: a){
            System.out.println(i);
        }


        /*Definiálj egy hat elemű boolean tömböt, és felváltva írj bele true vagy false értéket,
        0. index esetén legyen false! Ciklusban írd ki az elemeit!*/
        boolean[] booleans = new boolean[6];
        booleans[0] = false;
        for (int i = 1; i < booleans.length; i++) {
            if (booleans[i-1] == false){
                booleans[i] = true;
            }else{
                booleans[i] = false;
            }
        }
        for (boolean i: booleans){
            System.out.println(i);
        }
    }
}

package week06d05;

public class Biscuit {

    /*
    Készíts egy Biscuit nevű osztályt, amelynek van két attribútuma: BiscuitType type és int gramAmount.
    A BiscuitType legyen felsorolásos típus a három kedvenc kekszfajtáddal! A Biscuit nevű osztálynak legyen egy static metódusa of néven, mely paraméterként egy BiscuitType-ot,
    és egy int gramAmount-ot vár és visszaad egy új Biscuit objektumot amelyet a megadott paraméterek alapján hoz létre.
    Bónusz feladat: konzolra írás esetén a Biscuit jelenítse meg a type és a gramAmount mezőket!
   */

    private BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }

    static Biscuit of (BiscuitType biscuitType, int gramAmount){

        Biscuit biscuit = new Biscuit(biscuitType, gramAmount);

        return biscuit;
    }
}

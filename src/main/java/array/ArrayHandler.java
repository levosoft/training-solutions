package array;

public class ArrayHandler {

    /*Hozz létre egy array.ArrayHandler osztályt, és implementálj benne egy boolean contains(int[] source, int itemToFind) metódust,
    mely visszaadja, hogy a paraméterként megadott érték benne van-e a szintén paramérként átadott tömbben!

    A fenti array.ArrayHandler osztályba implementálj egy újabb int find(int[] source, int itemToFind) metódust,
    mely visszaadja a paraméterként megadott érték indexét, ha benne van a tömbben, és -1-et, ha nincs benne!*/

    public boolean contains(int[] source, int itemToFind){

        for (int i: source){
            if(i == itemToFind){
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind){
        int index = -1;
        for (int i: source){
            index++;
            if(i == itemToFind){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int[] testArray = {2,4,6,8,10,12,14,16,18,20};
        int testIntA = 12;
        int testIntB = 13;

        System.out.println(arrayHandler.contains(testArray,testIntA));
        System.out.println(arrayHandler.find(testArray, testIntA));

        System.out.println(arrayHandler.contains(testArray,testIntB));
        System.out.println(arrayHandler.find(testArray, testIntB));

    }

}

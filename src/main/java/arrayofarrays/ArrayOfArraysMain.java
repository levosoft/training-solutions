package arrayofarrays;

public class ArrayOfArraysMain {
    /*Hozz létre egy int[][] multiplicationTable(int size) metódust, mely a paraméterként megadott méretű szorzótáblát adja vissza! */

    public int[][] multiplicationTable(int size){
        int[][] mt = new int[size][size];

        for (int i = 1; i <= size; i++) {
            mt[i-1][i-1] = i;
        }

        return mt;
    }

    public void printArrayOfArrays(int[][] a){

    }

    public static void main(String[] args) {
        ArrayOfArraysMain aa = new ArrayOfArraysMain();
        aa.multiplicationTable(3);


    }
}

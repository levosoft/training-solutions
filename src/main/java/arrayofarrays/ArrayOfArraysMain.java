package arrayofarrays;

public class ArrayOfArraysMain {

    /*Hozz létre egy int[][] multiplicationTable(int size) metódust, mely a paraméterként megadott méretű szorzótáblát adja vissza! */
    public int[][] multiplicationTable(int size){
        int[][] mt = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mt[i][j]=(i+1)*(j+1);
            }
        }
        return mt;
    }

    /*Hozz létre egy printArrayOfArrays(int[][] a) metódust, mely kiír egy tömbök tömbjét!
    A beágyazott tömbök elemeit egymás mellé, a külső tömb elemeit egymás alá.*/
    public void printArrayOfArrays(int[][] arAr){
        for (int i[]: arAr){
            for (int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayOfArraysMain aOa = new ArrayOfArraysMain();
        aOa.printArrayOfArrays(aOa.multiplicationTable(10));
    }
}

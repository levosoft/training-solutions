package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString());
    }

    public String numberOfDaysAsString(){
        /*int[] numberOfDays = new int[12];
        numberOfDays[0] = 31;
        numberOfDays[1] = 28;
        numberOfDays[2] = 31;
        numberOfDays[3] = 30;
        numberOfDays[4] = 31;
        numberOfDays[5] = 30;
        numberOfDays[6] = 31;
        numberOfDays[7] = 31;
        numberOfDays[8] = 30;
        numberOfDays[9] = 31;
        numberOfDays[10] = 30;
        numberOfDays[11] = 31;*/

        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek(){
        return Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");
    }

    public String multiplicationTableAsString(int size){
        int[][] mt = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mt[i][j]=(i+1)*(j+1);
            }
        }
        return Arrays.deepToString(mt);
    }

}

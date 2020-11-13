package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.daysOfWeek());
        System.out.println(arraysMain.multiplicationTableAsString(4));

        double[] day1temps = {13.5, 14.6, 13.9};
        double[] day2temps = {14.3, 15.4, 14.9};
        System.out.println(arraysMain.sameTempValues(day1temps, day2temps));

        int[] firstNumbers = {1,2,3,4,5};
        int[] secondNumbers = {1,2,3,4,5};
        int[] thirdNumbers = {6,7,8,9,10};
        System.out.println(arraysMain.wonLottery(firstNumbers, secondNumbers));
        System.out.println(arraysMain.wonLottery(firstNumbers, thirdNumbers));
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

    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
    }

    public boolean wonLottery(int[] ownNumbers, int[] winnerNumbers){
        Arrays.sort(ownNumbers, 0, ownNumbers.length);
        Arrays.sort(winnerNumbers, 0, winnerNumbers.length);
        return Arrays.equals(ownNumbers, winnerNumbers);
    }
}

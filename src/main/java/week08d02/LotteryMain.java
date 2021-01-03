package week08d02;

import java.util.ArrayList;
import java.util.List;

public class LotteryMain {

    public static void main(String[] args) {

        Lottery lottery = new Lottery();

        List<Integer> winnerNumbers = new ArrayList<>();
        winnerNumbers = lottery.getNumbers();

        for (int i = 0; i < winnerNumbers.size(); i++) {
            System.out.println(winnerNumbers.get(i));
        }
    }


}

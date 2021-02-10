package sajatgyak;

import java.time.LocalDateTime;
import java.time.Month;

public class DatePractice {

    public static void main(String[] args) {
        LocalDateTime time1 = LocalDateTime.of(2021, Month.FEBRUARY, 10, 16, 26);

        System.out.println(time1);  //Idő elválasztása a dátumtól T-karakterrel
    }
}

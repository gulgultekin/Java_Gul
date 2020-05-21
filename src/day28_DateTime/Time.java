package day28_DateTime;

import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {

        LocalTime time1 = LocalTime.now();
        System.out.println(time1); // 10:31:10.082

        LocalTime time2 = LocalTime.of(23,59,59);
        System.out.println(time2);






    }
}

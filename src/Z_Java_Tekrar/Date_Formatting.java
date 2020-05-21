package Z_Java_Tekrar;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Formatting {
    public static void main(String[] args) {


      LocalDate date = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E MM dd yyyy");
        System.out.println(date.format(dtf));
    }
}

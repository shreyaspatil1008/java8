package DateTimeFormatExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeCalculationExample {
    public static void main(String[] a){
        LocalDate today = LocalDate.now();
        LocalDate previousDate = today.minus(1,ChronoUnit.WEEKS);
        LocalDate nextDate = today.plus(1,ChronoUnit.WEEKS);

        System.out.println(today);
        System.out.println(nextDate);
        System.out.println(previousDate);

        previousDate = today.minus(1,ChronoUnit.MONTHS);
        nextDate = today.plus(1,ChronoUnit.MONTHS);


        System.out.println(nextDate);
        System.out.println(previousDate);
        previousDate = today.minus(1,ChronoUnit.DECADES);
        nextDate = today.plus(1,ChronoUnit.DECADES);

        System.out.println(nextDate);
        System.out.println(previousDate);

        nextDate = today.plus(1,ChronoUnit.YEARS);
        previousDate = today.minus(1,ChronoUnit.YEARS);

        System.out.println(nextDate);
        System.out.println(previousDate);

    }
}

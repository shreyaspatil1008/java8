package sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Example {

    public static void main(String[] a){
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonthValue());
        System.out.println(date.getMonth());

        System.out.println("----------------------------------------------------");

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getNano());
        System.out.println(time.getSecond());
        System.out.println(LocalTime.MIDNIGHT);

        System.out.println("----------------------------------------------------");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfYear());
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getMinute());
        System.out.println(dateTime.getSecond());
        System.out.println("----------------------------------------------------");

        LocalDate d = LocalDate.of(2018,10,18);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(d.format(formatter));
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE yyyy MMMM dd");
        System.out.println(d.format(formatter2));
    }
}

package DateTimeFormatExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatExample {
    public static void main(String[] a){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(date.format(dtf));

        dtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(time.format(dtf));


        dtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(dateTime.format(dtf));

        dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.MEDIUM);
        System.out.println(dateTime.format(dtf));


        dtf = DateTimeFormatter.ofPattern("MMM d, yyyy hh:mm a");
        System.out.println(dateTime.format(dtf));

        dtf = DateTimeFormatter.ofPattern("MMMM d, yyyy/EEE hh:mm a");
        System.out.println(dateTime.format(dtf));

        dtf = DateTimeFormatter.ofPattern("EEEE MMM d, yy hh:mm a");
        System.out.println(dateTime.format(dtf));

        dtf = DateTimeFormatter.ofPattern("MMM d, yy hh:mm a");
        System.out.println(dateTime.format(dtf));

    }
}

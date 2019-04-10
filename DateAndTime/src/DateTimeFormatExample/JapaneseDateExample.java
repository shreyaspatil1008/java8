package DateTimeFormatExample;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class JapaneseDateExample {
    public static void main(String[] a){
        JapaneseDate date = JapaneseDate.now();
        System.out.println(date);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM yyyy dd");
        System.out.println(date.format(dtf));
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));
        System.out.println(date.get(ChronoField.ERA));
        System.out.println(date.get(ChronoField.YEAR));
    }
}

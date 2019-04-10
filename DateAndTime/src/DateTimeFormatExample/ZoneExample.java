package DateTimeFormatExample;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ZoneExample {
    public static void main(String[] a){
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        List<String> neList = new ArrayList<>(allZones);
        Collections.sort(neList);


        for(String string : neList){
            ZoneId one = ZoneId.of(string);
            LocalDateTime dt = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.MEDIUM);
            System.out.println(one+"--->"+dt.format(dtf));
        }


    }
}

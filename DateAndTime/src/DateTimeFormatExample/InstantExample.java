package DateTimeFormatExample;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class InstantExample {
    public static void main(String[] a){
        Instant i1 = Instant.now();
        Instant i2 = Instant.now().plus(1, ChronoUnit.HOURS);
        Duration duration = Duration.between(i1,i2);

        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toNanos());



    }
}

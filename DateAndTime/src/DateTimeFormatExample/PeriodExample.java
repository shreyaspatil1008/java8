package DateTimeFormatExample;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] a){
        LocalDate date = LocalDate.now();
        LocalDate birthday = LocalDate.of(1988, Month.DECEMBER, 7);
        Period p = Period.between(birthday,date);
        System.out.println("You are "+p.getYears() + " years, "+p.getMonths() + " months, and "+p.getDays()+" days old" );
    }
}

package train.problem;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] a){
        List<Train> trains = new ArrayList<>();
        trains.add(new Train(1,"Sharavati","Pune","Delhi", LocalDateTime.now(),LocalDateTime.now()));
        trains.add(new Train(1,"Sharavati1","Miraj","Pune", LocalDateTime.now(),LocalDateTime.now().plus(8, ChronoUnit.HOURS)));
        trains.add(new Train(1,"Sharavati2","Sangali","Delhi", LocalDateTime.now(),LocalDateTime.now().plus(12, ChronoUnit.HOURS)));
        trains.add(new Train(1,"Sharavati3","Sangali","Pune", LocalDateTime.now(),LocalDateTime.now().plus(15, ChronoUnit.HOURS)));
        trains.add(new Train(1,"Sharavati4","Mumbai","Delhi", LocalDateTime.now(),LocalDateTime.now().plus(24, ChronoUnit.HOURS)));

        System.out.println("The long distance trains are: ");
        for (Train train:trains){
            LocalDateTime i1 = train.getArrivalTime();
            LocalDateTime i2 = train.getDepartureTime();
            long hours = i2.until( i1, ChronoUnit.HOURS);
            if(hours > 8){
                System.out.println(train.getName()+" :: "+hours+" Hours");
            }
        }
    }
}

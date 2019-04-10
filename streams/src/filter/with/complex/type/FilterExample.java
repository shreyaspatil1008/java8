package filter.with.complex.type;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] a){
        List<Planet> planetList = new ArrayList<>();
        planetList.add(new Planet());
        planetList.add(new Planet("Mars",2));
        planetList.add(new Planet("Jupitor",16));
        planetList.add(new Planet("Saturn",14));
        planetList.add(new Planet("Uranus",5));

        Predicate<Planet> pr = p -> (p.getNoOfMoons())%2 == 0;
        Predicate<Planet> pr2 = p -> (p.getName().charAt(0)=='J');
        Predicate<Planet> pr3 = p -> (p.getNoOfMoons()>2);

        Stream<Planet> planetStream = planetList.stream().filter(pr).filter(pr2).filter(pr3);
        planetStream.forEach(n -> System.out.println(n));

    }
}

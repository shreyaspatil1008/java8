package second.assignment;

import java.io.IOException;
import java.util.Collection;

public class Main {

    public static void main(String[] a) throws IOException {

        PersonDataProcessor personDataAvarageAgeFinder = new PersonDataAvarageAgeFinder();
        PersonDataProcessor personDataMaximumAgeFinder = new PersonDataMaximumAgeFinder();
        Collection<Person> persoData = personDataAvarageAgeFinder.getAllPersons();
        System.out.println(personDataAvarageAgeFinder.processPersonData(persoData));
        System.out.println(personDataMaximumAgeFinder.processPersonData(persoData));
    }
}

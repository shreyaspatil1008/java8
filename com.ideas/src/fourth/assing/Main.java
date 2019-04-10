package fourth.assing;

import second.assignment.Person;

import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] a) throws IOException {
        Comparator<Person> comparator ;
        comparator = new SortPersonsNameAsc()::sortPersons;
        Set<Person> personSetName = new TreeSet<>(comparator);
        personSetName.addAll(PersonDataStore.getAllPersons());
        System.out.println(personSetName);
        comparator = SortPersonsAgeDesc::sortPersons;
        Set<Person> personSetAge = new TreeSet<>(comparator);
        personSetAge.addAll(PersonDataStore.getAllPersons());
        System.out.println(personSetAge);
    }
}

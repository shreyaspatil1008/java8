package second.assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface PersonDataProcessor {
    Object processPersonData(Collection<Person> personData);

    default Collection<Person> getAllPersons() throws IOException {
        Collection<Person> collection = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get("Person.txt"));
        List<Person> persons = new ArrayList<>();
        for(String line: lines){
                String[] values = line.split(":");

        }
        ((ArrayList<Person>) collection).add(new Person("Shreyas",12));
        ((ArrayList<Person>) collection).add(new Person("Shreyas1",10));
        ((ArrayList<Person>) collection).add(new Person("Shreyas2",11));
        ((ArrayList<Person>) collection).add(new Person("Shreyas3",12));
        ((ArrayList<Person>) collection).add(new Person("Shreyas4",12));
        System.out.println("Retrieving persons");
        return collection;
    }
}

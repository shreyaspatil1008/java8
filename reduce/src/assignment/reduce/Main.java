package assignment.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] a){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Neel","3344556677",154,65.5f));
        personList.add(new Person("Harry","4433556677",174,75.5f));
        personList.add(new Person("Jack","98765743210",134,45.5f));
        personList.add(new Person("Rosel","9898989898",184,80.5f));
        personList.add(new Person("Rina","7676767676",164,62.5f));

        Stream<Person> personStream = personList.stream();
        Function<Person,PhoneBook> pbFunc = p -> {
            PhoneBook pb = new PhoneBook(p.getName(),p.getPhoneNum());
            return pb;
        };

        Stream<PhoneBook> contactPerson = personStream.map(pbFunc);
        contactPerson.forEach(p -> System.out.println(p));

        personStream = personList.stream();
        Function<Person,FitnessInfo> fiFunc = p -> {
            FitnessInfo fi = new FitnessInfo(p.getName(),p.getHeight(),p.getWeight());
            return fi;
        };

        Stream<FitnessInfo> fitnessStream = personStream.map(fiFunc);
        fitnessStream.forEach(p -> System.out.println(p));

    }
}

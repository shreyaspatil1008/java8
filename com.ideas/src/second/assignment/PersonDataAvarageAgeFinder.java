package second.assignment;

import java.util.Collection;

public class PersonDataAvarageAgeFinder implements PersonDataProcessor {
    @Override
    public Object processPersonData(Collection<Person> personData){
        int totalAge = 0;
        for (Person person:personData){
            totalAge = totalAge+person.getAge();
        }
        return totalAge / personData.size();
    }
}

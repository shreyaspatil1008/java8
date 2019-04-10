package second.assignment;

import java.util.*;

public class PersonDataMaximumAgeFinder implements PersonDataProcessor {

    @Override
    public Object processPersonData(Collection<Person> personData){
        Map<Integer, List<String>> map = new TreeMap<>();
        List<Integer> ageSet = new ArrayList<>();
        for(Person person : personData){
            if(map.containsKey(person.getAge())){
                List<String> names = map.get(person.getAge());
                names.add(person.getName());
                map.put(person.getAge(),names);
            } else{
                List<String> names = new ArrayList<>();
                names.add(person.getName());
                map.put(person.getAge(),names);
            }
            ageSet.add(person.getAge());
        }
        Collections.sort(ageSet);
        return map.get(ageSet.get(ageSet.size()-1));
    }
}

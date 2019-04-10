package fourth.assing;

import second.assignment.Person;

public class SortPersonsNameAsc {

    public int sortPersons(Person p1, Person p2){
        return p1.getName().compareTo( p2.getName());
    }
}

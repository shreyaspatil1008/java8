package movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainMovie {
    public static void main(String[] a){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Singham","Maharashtra",5));
        movies.add(new Movie("Singham","Karnataka",3));
        movies.add(new Movie("Singham","Tamilnadu",10));
        movies.add(new Movie("Singham","Tamilnadu",10));
        movies.add(new Movie("Singham","Tamilnadu",10));
        movies.add(new Movie("Singham Returns","Maharashtra",15));
        movies.add(new Movie("Singham Returns","Karnataka",15));
        movies.add(new Movie("Singham Returns","Tamilnadu",12));
        movies.add(new Movie("Taal","Maharashtra",3));
        movies.add(new Movie("Taal","Karnataka",5));
        movies.add(new Movie("Taal","Tamilnadu",2));


        List<Movie> list = movies.stream().collect(Collectors.toList());
        for (Movie i: list){
            System.out.println(i);
        }
        System.out.println("---------------------------------------");
        Set<Movie> set = movies.stream().collect(Collectors.toSet());
        for (Movie i: set){
            System.out.println(i);
        }


    }
}

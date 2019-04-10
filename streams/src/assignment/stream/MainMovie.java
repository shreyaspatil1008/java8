package assignment.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainMovie {
    public static void main(String[] a){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Singham","Maharashtra",5));
        movies.add(new Movie("Singham","Karnataka",3));
        movies.add(new Movie("Singham","Tamilnadu",10));
        movies.add(new Movie("Singham Returns","Maharashtra",15));
        movies.add(new Movie("Singham Returns","Karnataka",15));
        movies.add(new Movie("Singham Returns","Tamilnadu",12));
        movies.add(new Movie("Taal","Maharashtra",3));
        movies.add(new Movie("Taal","Karnataka",5));
        movies.add(new Movie("Taal","Tamilnadu",2));


        Stream<Movie> movieStream = movies.stream();
        //2. Specific movie name
        Predicate<Movie> singhamPredicate = p -> p.getName().contains("Singham");
        Predicate<Movie> statePredicate = p -> p.getState().equals("Karnataka") && p.getCollectionInCrores() >= 5;

        Stream<Movie> singhamStream = movieStream.filter(singhamPredicate);
        singhamStream.forEach(p -> System.out.println(p));
        System.out.println("___________________________________________");
        movieStream = movies.stream();
        Stream<Movie> karnatakaStream = movieStream.filter(statePredicate);
        karnatakaStream.forEach(p -> System.out.println(p));


    }
}

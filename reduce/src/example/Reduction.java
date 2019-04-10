package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduction {

    public static void main(String[] a){
        List<Integer> myList = new ArrayList<>();
        myList.add(34);
        myList.add(65);
        myList.add(23);
        myList.add(435);
        myList.add(54);

        Stream<Integer> stream = myList.stream();
        Optional<Integer> sum = stream.reduce((x, y)->x+y);
        System.out.println(sum.get());
    }
}

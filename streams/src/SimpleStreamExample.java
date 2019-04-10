import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SimpleStreamExample {
    public static void main(String[] a){
        List<Integer> myList = new ArrayList<>();
        myList.add(34);
        myList.add(65);
        myList.add(23);
        myList.add(435);
        myList.add(54);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> optional = myStream.min(Integer::compare);
        System.out.println("Min: "+optional.get());

        myStream = myList.stream();
        optional = myStream.max(Integer::compare);
        System.out.println("Max: "+optional.get());

        myStream = myList.stream().sorted();
        myStream.forEach((n) -> System.out.println(n+" "));

    }
}

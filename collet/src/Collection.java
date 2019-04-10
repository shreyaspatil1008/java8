import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection {

    public static void main(String[] a){
        List<Integer> myList = new ArrayList<>();
        myList.add(34);
        myList.add(34);
        myList.add(34);
        myList.add(34);
        myList.add(34);
        myList.add(65);
        myList.add(23);
        myList.add(435);
        myList.add(54);

        Stream<Integer> stream = myList.stream();
        List<Integer> list = myList.stream().collect(Collectors.toList());
        for (Integer i: list){
            System.out.println(i);
        }
        System.out.println("---------------------------------------");
        Set<Integer> set = myList.stream().collect(Collectors.toSet());
        for (Integer i: set){
            System.out.println(i);
        }
    }
}

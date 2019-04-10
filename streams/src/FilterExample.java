import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] d){
        List<Integer> myList = new ArrayList<>();
        myList.add(34);
        myList.add(65);
        myList.add(23);
        myList.add(435);
        myList.add(54);

        Stream<Integer> stream = myList.stream().filter(n -> n%2==0 );
        stream.forEach(n->System.out.println(n));
    }
}

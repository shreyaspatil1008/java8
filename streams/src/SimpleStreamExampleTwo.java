import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleStreamExampleTwo {
    public static void main(String[] a){
        int arr[]= {34,45,254,45,64};
        IntStream myStream = Arrays.stream(arr);

        OptionalInt optional = myStream.min();
        System.out.println("Min: "+optional.getAsInt());
        myStream = Arrays.stream(arr);
        System.out.println("Max: "+myStream.max().getAsInt());
        myStream = Arrays.stream(arr).sorted();
        myStream.forEach((n) -> System.out.println(n+" "));
    }
}

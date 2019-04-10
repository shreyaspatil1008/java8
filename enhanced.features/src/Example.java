import java.util.Optional;

public class Example {

    public static void main(String[] a){
        Optional<String> noVal = Optional.empty();
        Optional<String> someVal = Optional.of("Hi");
        System.out.println(noVal.isPresent());
        System.out.println(someVal.isPresent());
        System.out.println(someVal.get());
        System.out.println(noVal.orElse("Test"));
        System.out.println(someVal.orElse("Test"));


    }
}

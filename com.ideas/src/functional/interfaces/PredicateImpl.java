package functional.interfaces;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<Integer> {


    @Override
    public boolean test(Integer integer) {
        return integer%2 == 0;
    }

    public static void main(String[] a){
        Predicate<Integer> unaryOperator = new PredicateImpl();
        System.out.println(unaryOperator.test(15));
        System.out.println(unaryOperator.test(16));
    }
}

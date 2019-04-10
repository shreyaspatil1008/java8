package functional.interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorImpl implements UnaryOperator<Integer> {


    @Override
    public Integer apply(Integer integer) {
        return integer*integer;
    }

    public static void main(String[] a){
        UnaryOperator<Integer> unaryOperator = new UnaryOperatorImpl();
        System.out.println(unaryOperator.apply(15));
    }
}

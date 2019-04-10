package functional.interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorImpl implements BinaryOperator<Integer> {


    @Override
    public Integer apply(Integer integer,Integer integer2) {
        return integer*integer2;
    }

    public static void main(String[] a){
        BinaryOperator<Integer> unaryOperator = new BinaryOperatorImpl();
        System.out.println(unaryOperator.apply(15,16));
    }
}

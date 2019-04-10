package functional.interfaces;

import java.util.function.Function;

public class FunctionImpl implements Function<Integer,Double> {


    @Override
    public Double apply(Integer integer) {
        return Math.sqrt(integer);
    }

    public static void main(String[] a){
        Function<Integer,Double> unaryOperator = new FunctionImpl();
        System.out.println(unaryOperator.apply(15));
    }
}

package functional.interfaces;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<Integer> {


    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }

    public static void main(String[] a){
        Consumer<Integer> operator = new ConsumerImpl();
        operator.accept(19);
    }
}

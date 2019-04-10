package functional.interfaces;

import java.util.function.Supplier;

public class SupplierImpl implements Supplier<Integer> {


    @Override
    public Integer get() {
        return 20;
    }

    public static void main(String[] a){
        Supplier<Integer> operator = new SupplierImpl();
        System.out.println(operator.get());
    }
}

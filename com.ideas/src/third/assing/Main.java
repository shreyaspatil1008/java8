package third.assing;

import first.assignment.Rectangle;

public class Main {

    public static void main(String[] a){
        Calculator<Rectangle,Float> calculator;
        calculator = new AreaCalculator();
        Float area = calculator.calculate(new Rectangle());
        System.out.println("Area of rectangle:"+area);

        float x = 10.45f, y= 20.23f, sum = 0;
        sum = Calculator.add(x,y);
        System.out.println(sum);
    }
}

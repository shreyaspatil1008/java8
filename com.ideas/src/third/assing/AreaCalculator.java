package third.assing;

import first.assignment.Rectangle;

public class AreaCalculator implements Calculator<Rectangle,Float> {

    @Override
    public Float calculate(Rectangle rectangle){
        return rectangle.getArea();
    }
}

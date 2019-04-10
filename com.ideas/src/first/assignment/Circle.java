package first.assignment;

public class Circle implements Shape{
    int r;

    public Circle(){
        r = 10;
    }

    @Override
    public void draw(){
        System.out.println("PersonDataMaximumAgeFinder r:"+r);

    }

    @Override
    public float getArea(){
        return PI*r*r;
    }
}

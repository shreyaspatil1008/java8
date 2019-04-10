package first.assignment;
public class Rectangle implements Shape{
    private int length,breadth;

    public Rectangle(){
        length = 10;
        breadth = 5;
    }

    @Override
    public void draw(){
        System.out.println("PersonDataAvarageAgeFinder length:"+length+", Breadth:"+breadth);
    }

    @Override
    public float getArea(){
        return length*breadth;
    }
}

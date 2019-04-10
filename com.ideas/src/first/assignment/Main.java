package first.assignment;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] a){

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle());
        shapes.add(new Circle());
        System.out.println("drawing");
        for (Shape shape : shapes){
            shape.draw();
        }
        System.out.println("area");
        for (Shape shape : shapes){
            System.out.println(shape.getArea());
        }
        System.out.println("erasing");
        for (Shape shape : shapes){
            shape.erase();
        }
    }
}

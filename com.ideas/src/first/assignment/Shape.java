package first.assignment;
public interface Shape {
    void draw();
    float getArea();
    float PI = 3.14f;

    default void erase(){
        System.out.println("Erasing the shape");
    }
}

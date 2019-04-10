package third.assing;

public interface Calculator<T,R> {
    static float add(float a, float b){
        return a+b;
    }
    R calculate(T obj);
}

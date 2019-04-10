package assignment.reduce;

public class FitnessInfo {

    private String name;
    private int height;
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "FitnessInfo{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public FitnessInfo(String name, int height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

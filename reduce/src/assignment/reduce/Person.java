package assignment.reduce;

public class Person {
    private String name;
    private String phoneNum;
    private int height;
    private float weight;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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

    public Person(String name, String phoneNum, int height, float weight) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.height = height;
        this.weight = weight;
    }
}

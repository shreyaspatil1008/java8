package filter.with.complex.type;

public class Planet {
    private String name;
    private int noOfMoons;

    public Planet() {
        name = "Jther";
        noOfMoons =4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfMoons() {
        return noOfMoons;
    }

    public void setNoOfMoons(int noOfMoons) {
        this.noOfMoons = noOfMoons;
    }

    public Planet(String name, int noOfMoons) {
        this.name = name;
        this.noOfMoons = noOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", noOfMoons=" + noOfMoons +
                '}';
    }
}

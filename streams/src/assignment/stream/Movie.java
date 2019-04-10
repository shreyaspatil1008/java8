package assignment.stream;

import java.util.Objects;

public class Movie {
    private String name;
    private String state;
    private int collectionInCrores;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", collectionInCrores=" + collectionInCrores +
                '}';
    }

    public Movie(String name, String state, int collectionInCrores) {
        this.name = name;
        this.state = state;
        this.collectionInCrores = collectionInCrores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return getCollectionInCrores() == movie.getCollectionInCrores() &&
                getName().equals(movie.getName()) &&
                getState().equals(movie.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getState(), getCollectionInCrores());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCollectionInCrores() {
        return collectionInCrores;
    }

    public void setCollectionInCrores(int collectionInCrores) {
        this.collectionInCrores = collectionInCrores;
    }
}

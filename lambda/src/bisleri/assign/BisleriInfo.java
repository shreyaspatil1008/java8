package bisleri.assign;

import java.util.Objects;

public class BisleriInfo {
    private int volume;
    private float price;

    public BisleriInfo(float price, int volume) {
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BisleriInfo{" +
                "volume=" + volume +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BisleriInfo)) return false;
        BisleriInfo that = (BisleriInfo) o;
        return getVolume() == that.getVolume() &&
                Float.compare(that.getPrice(), getPrice()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVolume(), getPrice());
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

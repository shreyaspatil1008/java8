package bisleri.assign;

import java.util.Objects;

public class BisleriPack {
    private int batchNo;
    private BisleriBottle bottleType;
    private int quantity;

    public BisleriPack(int batchNo, BisleriBottle bottleType, int quantity) {
        this.batchNo = batchNo;
        this.bottleType = bottleType;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BisleriPack)) return false;
        BisleriPack that = (BisleriPack) o;
        return getBatchNo() == that.getBatchNo() &&
                getQuantity() == that.getQuantity() &&
                getBottleType().equals(that.getBottleType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBatchNo(), getBottleType(), getQuantity());
    }

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }

    public BisleriBottle getBottleType() {
        return bottleType;
    }

    public void setBottleType(BisleriBottle bottleType) {
        this.bottleType = bottleType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BisleriPack{" +
                "batchNo=" + batchNo +
                ", bottleType=" + bottleType +
                ", quantity=" + quantity +
                '}';
    }
}

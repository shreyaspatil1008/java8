package train.problem;

import java.time.LocalDateTime;
import java.util.Objects;

public class Train {
    private int trainNo;
    private String name;
    private String stationFrom;
    private String stationTo;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        return getTrainNo() == train.getTrainNo() &&
                getName().equals(train.getName()) &&
                getStationFrom().equals(train.getStationFrom()) &&
                getStationTo().equals(train.getStationTo()) &&
                getDepartureTime().equals(train.getDepartureTime()) &&
                getArrivalTime().equals(train.getArrivalTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTrainNo(), getName(), getStationFrom(), getStationTo(), getDepartureTime(), getArrivalTime());
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNo=" + trainNo +
                ", name='" + name + '\'' +
                ", stationFrom='" + stationFrom + '\'' +
                ", stationTo='" + stationTo + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStationFrom() {
        return stationFrom;
    }

    public void setStationFrom(String stationFrom) {
        this.stationFrom = stationFrom;
    }

    public String getStationTo() {
        return stationTo;
    }

    public void setStationTo(String stationTo) {
        this.stationTo = stationTo;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Train(int trainNo, String name, String stationFrom, String stationTo, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.trainNo = trainNo;
        this.name = name;
        this.stationFrom = stationFrom;
        this.stationTo = stationTo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
}

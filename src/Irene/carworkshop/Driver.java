package Irene.carworkshop;

public class Driver {
    private String driverName;
    private Car car;

    public Driver(String driverName, Car car) {
        this.driverName = driverName;
        this.car = car;
    }

    public String getDriverName() {
        return driverName;
    }
}

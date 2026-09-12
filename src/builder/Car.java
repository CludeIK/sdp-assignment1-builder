package builder;

public class Car {
    private final CarType type;
    private final int seats;
    private final Engine engine;
    private final boolean hasGPS;
    private final boolean hasTripComputer;

    public Car(CarType type, int seats, Engine engine, boolean hasGPS, boolean hasTripComputer) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.hasGPS = hasGPS;
        this.hasTripComputer = hasTripComputer;
    }

    @Override
    public String toString() {
        return "Car{" + "type=" + type + ", seats=" + seats + ", egine=" +
                engine + ", hasGPS=" + hasGPS + ", hasTripComputer=" + hasTripComputer + "}";
    }
}

package builder;

public class SuvBuilder implements CarBuilder {
    private CarType type;
    private int seats = 5;
    private Engine engine;
    private boolean hasGPS;
    private boolean hasTripComputer;

    @Override
    public CarBuilder setCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
        return this;
    }

    @Override
    public CarBuilder setTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
        return this;
    }

    @Override
    public Car build() {
        if (this.engine == null) {
            throw new IllegalStateException("Cannot build an SUV without an engine!");
        }
        return new Car(type, seats, engine, hasGPS, hasTripComputer);
    }
}
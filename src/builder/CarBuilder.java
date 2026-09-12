package builder;

public interface CarBuilder {
    CarBuilder setCarType(CarType type);
    CarBuilder setSeats(int seats);
    CarBuilder setEngine(Engine engine);
    CarBuilder setGPS(boolean hasGPS);
    CarBuilder setTripComputer(boolean hasTripComputer);

    Car build();
}

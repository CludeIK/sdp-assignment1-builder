package builder;

public class Director {
    public void consructSportsCar(CarBuilder builder){
        builder.setCarType(CarType.SPORTS_CAR)
                .setSeats(2)
                .setEngine(Engine.V8)
                .setGPS(true)
                .setTripComputer(true);
    }

    public void consructSUV(CarBuilder builder){
        builder.setCarType(CarType.SUV)
                .setSeats(5)
                .setEngine(Engine.V6)
                .setGPS(true)
                .setTripComputer(false);
    }
}

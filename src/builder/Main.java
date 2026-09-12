package builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        director.constructSportsCar(sportsCarBuilder);
        Car sportsCar = sportsCarBuilder.build();
        System.out.println("Built: " + sportsCar);

        CarBuilder suvBuilder = new SuvBuilder();
        director.constructSUV(suvBuilder);
        Car suv = suvBuilder.build();
        System.out.println("Built: " + suv);

        Car customCar = new SportsCarBuilder()
                .setCarType(CarType.SPORTS_CAR)
                .setSeats(4)
                .setEngine(Engine.ELECTRIC)
                .build();
        System.out.println("Custom Built: " + customCar);
    }
}

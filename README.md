# Builder Pattern - Car Manufacturing

## 1. What the product is
This project demonstrates the Creational Design Pattern **Builder** implemented in Java. The chosen product is a `Car`, which is a complex object with multiple optional configurations (e.g., GPS, trip computer) and variations (Engine type, Car type, number of seats).

## 2. How to build each representation
The construction logic is extracted into a `CarBuilder` interface.
- To build a specific representation, instantiate a concrete builder (e.g., `SportsCarBuilder` or `SuvBuilder`).
- You can manually chain methods (Fluent API) to create a custom car: `.setSeats(4).setEngine(Engine.ELECTRIC).build()`.
- For standard representations, use the `Director` class, which encapsulates the predefined sequences (e.g., `director.constructSportsCar(builder)`).

## 3. How to run it
1. Clone the repository and open the project in **IntelliJ IDEA**.
2. Navigate to `src/builder/Main.java`.
3. Run the `main` method. The output will print the generated car objects to the console.
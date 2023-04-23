package creational.factory;

/**
 * @author caci
 */

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();

        // Create a Car object
        Vehicle car = carFactory.createVehicle();
        car.drive(); // Output: Driving a car.

        // Create a Motorcycle object
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.drive(); // Output: Riding a motorcycle.
    }
}

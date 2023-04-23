package creational.factory;

/**
 * @author caci
 */

public class Main {

    // factory method
    public static VehicleFactory createVehicleFactory(VehicleType vehicleType){
        return switch (vehicleType) {
            case CAR -> new CarFactory();
            case MOTORCYCLE -> new MotorcycleFactory();
        };
    }

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = createVehicleFactory(VehicleType.CAR);

        // Create a Car object
        Vehicle car = vehicleFactory.createVehicle();
        car.drive(); // Output: Driving a car.
    }
}

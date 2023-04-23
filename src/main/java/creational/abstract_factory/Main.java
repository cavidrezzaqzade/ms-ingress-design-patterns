package creational.abstract_factory;

/**
 * @author caci
 */

public class Main {

    // factory method
    public static Vehicle getVehicle(VehicleFactory vehicleFactory){
        return vehicleFactory.createVehicle();
    }

    public static void main(String[] args) {
        Vehicle vehicle = getVehicle(new CarFactory());
        System.out.println(vehicle);
    }
}

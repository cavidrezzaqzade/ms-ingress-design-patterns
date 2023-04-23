package creational.factory;

/**
 * @author caci
 */

// Step 4: Implement concrete Factory classes that implement the Factory interface
class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

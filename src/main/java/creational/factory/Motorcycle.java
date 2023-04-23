package creational.factory;

/**
 * @author caci
 */

// Step 2: Implement concrete classes that implement the interface
class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a motorcycle.");
    }
}

package creational.abstract_factory2.formula1;

import creational.abstract_factory2.Vehicle;

/**
 * @author caci
 */

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

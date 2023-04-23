package creational.abstract_factory2.motoGP;

import creational.abstract_factory2.Vehicle;

/**
 * @author caci
 */

public class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Motorcycle is driving");
    }
}

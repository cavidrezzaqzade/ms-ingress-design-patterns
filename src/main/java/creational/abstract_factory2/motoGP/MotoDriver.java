package creational.abstract_factory2.motoGP;

import creational.abstract_factory2.Driver;

/**
 * @author caci
 */

public class MotoDriver implements Driver {
    @Override
    public void driveVehicle() {
        System.out.println("MotoDriver is driving");
    }
}

package creational.abstract_factory2.formula1;

import creational.abstract_factory2.Driver;

/**
 * @author caci
 */

public class FormulaDriver implements Driver {
    @Override
    public void driveVehicle() {
        System.out.println("FormulaDriver is driving");
    }
}

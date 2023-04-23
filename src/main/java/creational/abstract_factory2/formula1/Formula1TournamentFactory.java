package creational.abstract_factory2.formula1;

import creational.abstract_factory2.Driver;
import creational.abstract_factory2.Road;
import creational.abstract_factory2.TournamentFactory;
import creational.abstract_factory2.Vehicle;

/**
 * @author caci
 */

public class Formula1TournamentFactory implements TournamentFactory {
    @Override
    public Vehicle getVehicle() {
        return new Car();
    }

    @Override
    public Road getRoad() {
        return new AsphaltRoad();
    }

    @Override
    public Driver getDriver() {
        return new FormulaDriver();
    }
}

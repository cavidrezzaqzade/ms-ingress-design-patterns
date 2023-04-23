package creational.abstract_factory2.motoGP;

import creational.abstract_factory2.Driver;
import creational.abstract_factory2.Road;
import creational.abstract_factory2.TournamentFactory;
import creational.abstract_factory2.Vehicle;

/**
 * @author caci
 */

public class MotoGPTournamentFactory implements TournamentFactory {
    @Override
    public Vehicle getVehicle() {
        return new Motorcycle();
    }

    @Override
    public Road getRoad() {
        return new MountainRoad();
    }

    @Override
    public Driver getDriver() {
        return new MotoDriver();
    }
}

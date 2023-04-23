package creational.abstract_factory2;

/**
 * @author caci
 */

public interface TournamentFactory {
    Vehicle getVehicle();

    Road getRoad();

    Driver getDriver();
}

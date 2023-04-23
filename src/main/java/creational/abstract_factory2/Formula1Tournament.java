package creational.abstract_factory2;

import creational.abstract_factory2.formula1.Formula1TournamentFactory;

/**
 * @author caci
 */

public class Formula1Tournament {
    public static void main(String[] args) {
        TournamentFactory factory = new Formula1TournamentFactory();
        Vehicle vehicle = factory.getVehicle();
        Road road = factory.getRoad();
        Driver driver = factory.getDriver();

        System.out.println("Tournament started");
        vehicle.drive();
        road.analyzeRoad();
        driver.driveVehicle();
        System.out.println("Tournament ended");
    }
}

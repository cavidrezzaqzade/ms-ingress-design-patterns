package creational.abstract_factory2;

import creational.abstract_factory2.motoGP.MotoGPTournamentFactory;

/**
 * @author caci
 */

public class MotoGPTournament {
    public static void main(String[] args) {
        TournamentFactory factory = new MotoGPTournamentFactory();
        Driver driver = factory.getDriver();
        Road road = factory.getRoad();
        Vehicle vehicle = factory.getVehicle();

        System.out.println("Tournament started");
        road.analyzeRoad();
        vehicle.drive();
        driver.driveVehicle();
        System.out.println("Tournament ended");
    }
}

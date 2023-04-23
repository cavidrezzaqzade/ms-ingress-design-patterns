package creational.abstract_factory2.motoGP;

import creational.abstract_factory2.Road;

/**
 * @author caci
 */

public class MountainRoad implements Road {
    @Override
    public void analyzeRoad() {
        System.out.println("Road is mountain roads");
    }
}

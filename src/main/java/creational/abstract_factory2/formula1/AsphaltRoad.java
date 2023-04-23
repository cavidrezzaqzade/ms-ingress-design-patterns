package creational.abstract_factory2.formula1;

import creational.abstract_factory2.Road;

/**
 * @author caci
 */

public class AsphaltRoad implements Road {
    @Override
    public void analyzeRoad() {
        System.out.println("Road is asphalt");
    }
}

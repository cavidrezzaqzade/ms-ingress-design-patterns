package creational.singleton;

/**
 * @author caci
 * Static block initialization implementation is similar to eager initialization,
 * except that instance of the class is created in the static block that provides the option for exception handling.
 */

public class StaticBlockInitializationSingleton {

    private static StaticBlockInitializationSingleton instance;

    private StaticBlockInitializationSingleton(){}

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockInitializationSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockInitializationSingleton getInstance() {
        return instance;
    }
}

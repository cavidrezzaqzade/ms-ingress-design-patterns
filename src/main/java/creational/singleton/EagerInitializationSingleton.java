package creational.singleton;

/**
 * <h3>@author caci<h3/>
 * In eager initialization, the instance of the singleton class is created at the time of class loading.
 */
public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    // private constructor to avoid client applications using the constructor
    private EagerInitializationSingleton(){}

    public static EagerInitializationSingleton getInstance() {
        return instance;
    }
}
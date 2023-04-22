package creational.singleton;

/**
 * <h3>@author caci<h3/>
 * Lazy initialization means delaying the initialization of something until the first time it is needed
 */
public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() { }

    public static LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }
}


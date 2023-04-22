package creational.singleton;

/**
 * <h3>@author caci<h3/>
 * A simple way to create a thread-safe singleton class is to make the global access method synchronized
 * so that only one thread can execute this method at a time.
 * But there must be a lot of good ways to implement this functionality. Lock interface for example.
 * Because synchronized block use case in my opinion is not a good way and is an old way.
 */

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    //double-checked locking principle
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}

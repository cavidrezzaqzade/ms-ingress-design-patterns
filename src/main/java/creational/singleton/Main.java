package creational.singleton;

/**
 * @author caci
 */

public class Main {
    public static void main(String[] args) {
        //LazyInitializationSingleton singleton = new LazyInitializationSingleton(); this in not permitted

        LazyInitializationSingleton singleton = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton singleton2 = LazyInitializationSingleton.getInstance();

        System.out.println(singleton == singleton2); //true

    }
}

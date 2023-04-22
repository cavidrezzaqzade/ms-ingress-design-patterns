package creational.singleton;

/**
 * <h3>@author caci</h3>
 * Bill Pugh came up with a different approach to create the singleton class using an <b>inner static helper class</b>.
 */

public class BillPughSingleton {

    private BillPughSingleton(){}

    //inner static helper class
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
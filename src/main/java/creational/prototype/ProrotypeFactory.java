package creational.prototype;

/**
 * @author caci
 */

public class ProrotypeFactory {
    private final Prototype prototype;

    public ProrotypeFactory(Prototype prototype){
        this.prototype = prototype;
    }

    public Prototype clone(){
        return (Prototype) prototype.clone();
    }
}

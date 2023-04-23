package creational.prototype;

/**
 * @author caci
 */

public class Main {
    public static void main(String[] args) {
        // Create a prototype object
        ConcretePrototype prototype = new ConcretePrototype("Prototype", 22);

        // Clone the prototype to create a new object
        ConcretePrototype clonedObject = (ConcretePrototype) prototype.clone();

        // Use the cloned object
        System.out.println(clonedObject instanceof ConcretePrototype); // true
        System.out.println(clonedObject != prototype); // true

        // Use prototype factory
        var prototype1 = new ConcretePrototype("Prototype", 22);
        var prorotypeFactory = new ProrotypeFactory(prototype1);
        var prototypeClone = prorotypeFactory.clone();
        System.out.println(prototypeClone);
    }
}
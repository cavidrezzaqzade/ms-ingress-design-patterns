package creational.prototype;

/**
 * <h3>@author caci</h3>
 * Implement the prototype interface or extend the prototype abstract class
 */

public class ConcretePrototype implements Prototype {
    private String name;
    private Integer age;

    public ConcretePrototype(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Implement the clone method
    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name, this.age);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // Step 4: Define any additional methods or properties ...

}

# Prototype Design Pattern
![image.png](../../../resources/static/images/prototype.png)
## Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.
### Say you have an object, and you want to create an exact copy of it. How would you do it? First, you have to create a new object of the same class. Then you have to go through all the fields of the original object and copy their values over to the new object. Nice! But there’s a catch. Not all objects can be copied that way because some of the object’s fields may be private and not visible from outside of the object itself.There’s one more problem with the direct approach. Since you have to know the object’s class to create a duplicate, your code becomes dependent on that class. If the extra dependency doesn’t scare you, there’s another catch. Sometimes you only know the interface that the object follows, but not its concrete class, when, for example, a parameter in a method accepts any objects that follow some interface.
## How to Implement
- ### Create the prototype interface and declare the clone method in it. Or just add the method to all classes of an existing class hierarchy, if you have one.
- ### A prototype class must define the alternative constructor that accepts an object of that class as an argument. The constructor must copy the values of all fields defined in the class from the passed object into the newly created instance. If you’re changing a subclass, you must call the parent constructor to let the superclass handle the cloning of its private fields.
- ### The cloning method usually consists of just one line: running a new operator with the prototypical version of the constructor. Note, that every class must explicitly override the cloning method and use its own class name along with the new operator. Otherwise, the cloning method may produce an object of a parent class.
- ### Optionally, create a centralized prototype registry to store a catalog of frequently used prototypes.
## Pros
- ### You can clone objects without coupling to their concrete classes.
- ### You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
- ### You can produce complex objects more conveniently.
## Cons
- ### Cloning complex objects that have circular references might be very tricky.

## Usage examples: The Prototype pattern is available in Java out of the box with a Cloneable interface. Any class can implement this interface to become cloneable.
#### java.lang.Object#clone() (class should implement the java.lang.Cloneable interface)
## Identification: The prototype can be easily recognized by a clone or copy methods, etc.

## P.S
### The first thing you should know about Cloneable is - don't use it. It is very hard to implement cloning with Cloneable right, and the effort is not worth it.
### Instead of that use some other options, like apache-commons SerializationUtils (deep-clone) or BeanUtils (shallow-clone), or simply use a copy-constructor.
### copy: replicate to existing instance (shallow or deep) clone: replicate to new instance (always deep)
### shallow copy vs deep copy -> https://sharegpt.com/c/KROosvp
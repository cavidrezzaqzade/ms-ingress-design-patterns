![image.png](../../../resources/static/images/factory-method-en.png)
# Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
# In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
# The Factory Method Pattern is also known as 'Virtual Constructor'.
# A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.
# The factory pattern, or factory method pattern, is a creational design pattern in which a factory class is used to provide instances of an object, rather than instantiating them directly.
- ### Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
- ### Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.
- ### se the Factory Method when you want to save system resources by reusing existing objects instead of rebuilding them each time.
# How to Implement
- ### You can find implementation steps in the code examples.
# Pros
- ### You avoid tight coupling between the creator and the concrete products.
- ### Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
- ### Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.
# Cons
- ### The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.
# Usage Examples: 
- For example, the constructors of the wrapper classes (like Integer or Double) were recently marked @Deprecated, with the Javadoc note that you should use the factory method valueOf() instead.
- There are several "of" methods of java(Path, Optional, Collection's, Stream etc.)
# Singleton Design Pattern
![image.png](../../../resources/static/images/singleton.png)
  ## Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
  ## For more please read this article-> https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples  
  ## The Singleton pattern solves two problems at the same time, violating the Single Responsibility Principle:
### 1. Ensure that a class has just a single instance.
### 2. Provide a global access point to that instance.
  ## How to Implement
 - ### Add a private static field to the class for storing the singleton instance.
 - ### Declare a public static creation method for getting the singleton instance.
 - ### Implement “lazy initialization” inside the static method. It should create a new object on its first call and put it into the static field. The method should always return that instance on all subsequent calls.
 - ### Make the constructor of the class private. The static method of the class will still be able to call the constructor, but not the other objects.
  ## Pros
 - ### You can be sure that a class has only a single instance.
 - ### You gain a global access point to that instance.
 - ### The singleton object is initialized only when it’s requested for the first time.
  ## Cons
 - ### Violates the Single Responsibility Principle. The pattern solves two problems at the time.
 - ### The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
 - ### It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects. Since the constructor of the singleton class is private and overriding static methods is impossible in most languages, you will need to think of a creative way to mock the singleton. Or just don’t write the tests. Or don’t use the Singleton pattern.
  ## Usage examples
- ### java.lang.Runtime#getRuntime()
- ### java.awt.Desktop#getDesktop()
- ### java.lang.System#getSecurityManager()
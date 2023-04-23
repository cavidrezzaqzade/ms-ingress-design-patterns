# Abstract Factory Design Pattern
![image.png](../../../resources/static/images/abstract-factory-en.png)
## For more please read this article -> https://www.digitalocean.com/community/tutorials/abstract-factory-design-pattern-in-java
## Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.
- ### Use the Abstract Factory when your code needs to work with various families of related products, but you don’t want it to depend on the concrete classes of those products—they might be unknown beforehand or you simply want to allow for future extensibility.
- ### Consider implementing the Abstract Factory when you have a class with a set of Factory Methods that blur its primary responsibility.
## How to Implement
- ### You can find implementation steps in the code examples.
## Pros
- ### You can be sure that the products you’re getting from a factory are compatible with each other.
- ### You avoid tight coupling between concrete products and client code.
- ### Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support.
- ### Open/Closed Principle. You can introduce new variants of products without breaking existing client code.
## Cons
- ###  The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.
## Usage Examples: 
- ### javax.xml.parsers.DocumentBuilderFactory#newInstance()
- ### javax.xml.transform.TransformerFactory#newInstance()
- ### javax.xml.xpath.XPathFactory#newInstance()
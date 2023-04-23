# Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.
- ### Use the Builder pattern to get rid of a “telescoping constructor”.
- ### Use the Builder pattern when you want your code to be able to create different representations of some product
- ###  Use the Builder to construct Composite trees or other complex objects.
# For more please read this article -> https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
# How to Implement
- ### You can find implementation steps in the code examples.
# Pros
- ### You can construct objects step-by-step, defer construction steps or run steps recursively.
- ### You can reuse the same construction code when building various representations of products.
- ### Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.
# Cons
- ### The overall complexity of the code increases since the pattern requires creating multiple new classes.
# Usage examples: 
- java.lang.StringBuilder#append() (unsynchronized)
- java.lang.StringBuffer#append() (synchronized)
- java.nio.ByteBuffer#put() (also in CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)
- javax.swing.GroupLayout.Group#addComponent()
- All implementations java.lang.Appendable

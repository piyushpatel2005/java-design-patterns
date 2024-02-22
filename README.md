# Design Patterns

It is reusable solution for commonly occurring problems. Ir provides a common language for communication with developers
and colleagues. There are three types of design patterns

1. Creational Design Patterns
2. Behavioral Design Patterns
3. Structural Design Patterns

## Factory Pattern - Creational

This is one of the most popular creational patterns available and it is somewhat opposite to singleton pattern.

### Idea:

- Do not expose the instantiation logic to the client
- Defer the instantiation logic to subclasses. Client only knows the common interface available for creating objects.
- This is usuall implemented by architecture of the framework being used but can also be used by the end users.
- Real life examples include: `Calendar` class, `ResourceBundle`, `NumberFormat` classes in Java.
- Factory is responsible for the lifecyle of objects and it is referenced from a common interface. It can create
  multiple concrete classes and will include a method to request an object are parameterized using `create` method.

### Disadvantages:

- It is complex as we have to write too much code.
- The creation logic is not in the factory class but in the actual subclass being created.

Contrasts

| Singleton                         | Factory Pattern                    |
|:----------------------------------|:-----------------------------------|
| returns same instance every time  | returns new instance every time    |
| one constructor with no arguments | multiple constructors are involved |
| There is no interface             | It's mostly driven by interface    |
| There is no subtypes involved.    | It's mostly inheritance driven.    |

### Summary

- It is parameter driven
- It solves complex creation of objects in different way.
- It can be little complex.

## Abstract Class Pattern - Creational

This pattern is similar to Factory design pattern, but is implemented as factory of factories.

### Idea

- The idea for this pattern is to define interface and very general implementation for hierarchy of classes. The
  concrete implementation is provided by subclasses. This encourages polymorphism and also allows subclasses to focus on
  how they
  can provide different implementations.
- This is implemented using common interface and it takes it step further to defer the subclasses for instantiation
  logic.
- This pattern is also known as **template class pattern**, base class, design by principle, Liskov Substitution
  principle.
- This pattern is useful when we need framework classes with common interface or when clients should know what to expect
  or when we have situation where hierarchy should be extensible. We can easily add new subclasses without any change in
  superclass or clients.
- Real world examples include `DocumentBuilder` class in Java.

### Advantages:

- Polymorphism: All concrete classes have the same interface. Clients do not have to worry about the differences in
  implementation.
- Reusability: Implementations in abstract classes call abstract operations defined in concrete classes.

### Disadvantages:

- Client may not know whether to create abstract or concrete class all the time.
- Java Single hierarchy can be problem because in Java we can extend only one class. This is solved by interfaces in
  Java though.
- Sometimes super classes add methods which may not be needed in subclasses. This leads to unpleasant experience where
  we have to write unncessary methods in the subclasses even though we do not need those.
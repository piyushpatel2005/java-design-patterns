# Design Patterns

It is reusable solution for commonly occurring problems. There are three types of design patterns

1. Creational Design Patterns
2. Behavioral Design Patterns
3. Structural Design Patterns

## Abstract Class Pattern
The idea for this pattern is to defint interface and very general implementation for hierarchy of classes. The concrete implementation is provided by subclasses. This encourages polymorphism and also allows subclasses to focus on how they can provide different implementations.
This pattern is also known as template class pattern, base class, design by principle, Liskov Substitution principle.
This pattern is useful when we need framework classes with common interface, when clients should know what to expect or when we have situation where hierarchy should be extensible. We can easily add new subclasses without any change in superclass or clients.
### Advantages:
- Polymorphism: All concrete classes have the same interface. Clients do not have to worry about the differences in implementation.
- Reusability: Implementations in abstract classes call abstract operations defined in concrete classes.
### Disadvantages:
- Client may not know whether to create abstract or concrete class all the time.
- Java Single hierarchy can be problem because in Java we can extend only one class. This is solved by interfaces in Java though.
- Sometimes super classes add methods which may not be needed in subclasses. This leads to unpleasant experience where we have to write unncessary methods in the subclasses even though we do not need those.
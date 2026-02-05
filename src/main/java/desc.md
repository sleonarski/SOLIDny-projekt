# SOLID Principles

A collection of rules compiled and popularized by Robert C. Martin, a.k.a. Uncle Bob, describing how functions and data
structures should be arranged in classes and how these classes should be related to each other.

The goals of SOLID are:

- improved maintainability
- better understandability
- greater flexibility
- reduce complexity

1. <b>S</b> - <b>Single Responsibility Principle</b>
2. <b>O</b> - <b>Open-Closed Principle</b>
3. <b>L</b> - <b>Liskov Substitution Principle</b>
4. <b>I</b> - <b>Interface Segregation Principle</b>
5. <b>D</b> - <b>Dependency Inversion Principle</b>

## Single Responsibility Principle

>Class should only have one responsibility. Furthermore, it should only have one reason to change.

- One responsibility, one reason for change
- Functionalities dependent on different "actors" should be separated
- A change in one piece of code may unexpectedly affect another function that shares the same code.
- Applies to classes, modules, methods

## Open-Closed Principle

> classes should be open for extension but closed for modification

- New code shouldn't affect on existing one 
- Fewer bugs in existing code
- Better Backward compatibility

## Liskov Substitution Principle

>  If class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program.

- We should be able to replace A with B without breaking the base class contract.
- Conditions required to comply with the LSP principle:
  - Covariance of types returned in a subtype
  - Countervariance of arguments of methods in subtype
  - The subtype should not return new exceptions.
  - In the subtype, you cannot strengthen the preconditions.
  - In the subtype, the end conditions cannot be weakened.


## Interface Segregation Principle

> Larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

- avoiding excessive dependencies
- many differnt specialized interfaces
- easier to test
- logically related methods can be grouped together

## Dependency Inversion Principle

> High-level modules shouldn't depending on low-level modules. Instead, both will depend on abstractions.

- latwosc testowania
- 
# Visitor Pattern
[Refactoring Guru](https://refactoring.guru/design-patterns/visitor), [Digital Ocean](https://www.digitalocean.com/community/tutorials/visitor-design-pattern-java), [Java Spring Framework](https://springframework.guru/gang-of-four-design-patterns/visitor-pattern/)

## Overview
The Visitor pattern is a behavioral design pattern that allows you to add new operations to a group of related objects without modifying their class definitions.

## Initial Problem
In object-oriented programming, it is often necessary to add new operations to a group of related objects. However, doing so typically requires modifying the class definitions of the objects, which can lead to code that is difficult to maintain and extend. The Visitor pattern solves this problem by encapsulating the operations in separate visitor objects, which can be added to the group of related objects without modifying their class definitions.

##  When to Apply
The Visitor pattern is useful in the following situations:

* When you have a group of related objects and need to perform different operations on them without modifying their class definitions.
* When you want to add new operations to a group of related objects without modifying their class definitions.
* When you want to separate the algorithms that operate on an object structure from the objects themselves.
* When you have a large and complex object structure that would be difficult to modify using traditional inheritance and polymorphism.

In general, the Visitor pattern is useful in any situation where you need to add new operations to a group of related objects without modifying their class definitions or where you want to separate the algorithms that operate on an object structure from the objects themselves.

## UML Diagram
![Alt text](/src/behavioral/visitor/UML.jpg)

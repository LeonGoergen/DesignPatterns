# Strategy Pattern
## Overview
The Strategy pattern is a behavioral design pattern that allows you to define a family of algorithms, encapsulate each one as an object, and make them interchangeable at runtime. This pattern lets you change the behavior of an object at runtime without interfering with the behavior of other objects in the same system.

## Initial Problem
In software development, it is often necessary to implement different algorithms or behaviors for a particular task, such as sorting, searching, or encryption. However, hardcoding these algorithms into a class or function can lead to inflexible code that is difficult to maintain and extend. The Strategy pattern solves this problem by encapsulating each algorithm as an object, and allowing the client to choose which algorithm to use at runtime.

## When to Apply
The Strategy pattern is useful in the following situations:

* When you need to implement different algorithms or behaviors for a task, and you want to make them interchangeable at runtime.
* When you have a class or function that has multiple, similar conditional statements that switch between different algorithms or behaviors.
* When you want to implement a family of related algorithms, and you want to be able to add or remove algorithms easily without modifying existing code.
* When you want to isolate the behavior of an object from its implementation details, and you want to be able to change the behavior without changing the object's interface.

In general, the Strategy pattern is useful in any situation where you want to implement different behaviors or algorithms for a particular task, and you want to be able to change those behaviors at runtime without affecting other objects in the same system.

## UML Diagram

![Alt text](/src/behavioral/strategy/UML.jpg)
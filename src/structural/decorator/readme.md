# Decorator Pattern
[Refactoring Guru](https://refactoring.guru/design-patterns/decorator), [Digital Ocean](https://www.digitalocean.com/community/tutorials/decorator-design-pattern-in-java-example), [Java Spring Framework](https://springframework.guru/gang-of-four-design-patterns/decorator-pattern/)

## Overview
The Decorator pattern is a structural design pattern that allows behavior to be added to an object dynamically, without affecting the behavior of other objects of the same class. It provides a flexible alternative to subclassing for extending the functionality of an object.

## Initial Problem
In object-oriented programming, there are situations where you need to add additional functionality to an object at runtime without modifying its existing code or affecting other instances of the same class. Traditional inheritance solves this problem by creating subclasses, but it often leads to a large number of subclasses and a rigid class hierarchy. The Decorator pattern addresses this problem by allowing you to add behavior to an object by wrapping it with one or more decorator objects.

## When to Apply
You can apply the Decorator pattern in the following scenarios:

* When you need to add functionality to an object dynamically without modifying its existing code.
*  you want to extend the behavior of an object without creating a large number of subclasses.
* When you want to add or remove responsibilities from an object dynamically at runtime.
* When you need to add behavior to an object that may vary independently.
* The Decorator pattern is particularly useful when you have a set of closely related classes and want to add behavior to them in a flexible and modular way, without modifying their existing code.

By using the Decorator pattern, you can achieve a higher degree of flexibility and reusability in your code, as well as avoid the proliferation of subclasses.

![Alt text](UML.png)
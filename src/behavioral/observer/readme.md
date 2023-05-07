# Observer Pattern
[Refactoring Guru](https://refactoring.guru/design-patterns/observer), [Digital Ocean](https://www.digitalocean.com/community/tutorials/observer-design-pattern-in-java), [Java Spring Framework](https://springframework.guru/gang-of-four-design-patterns/observer-pattern/)

## Overview
The Observer pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Initial Problem
In object-oriented design, there are often situations where one object needs to notify other objects about changes in its state. However, the object does not want to tightly couple itself to the other objects, because doing so would make the code less modular and harder to maintain. The Observer pattern solves this problem by defining a loosely coupled relationship between the subject (the object being observed) and its observers (the objects interested in its state). The subject maintains a list of its observers and notifies them automatically when its state changes.

## When to Apply
The Observer pattern is useful in the following situations:

* When you need to notify other objects about changes in the state of an object, but you don't want to tightly couple the objects together.
* When you need to maintain consistency between related objects without making them dependent on each other.
* When you need to decouple user-interface components from the underlying model data.
* When you need to implement publish/subscribe functionality in your application.

In general, the Observer pattern is useful in any situation where you want to define a one-to-many relationship between objects, where the state of one object affects the state of other objects.

## UML Diagram

![Alt text](/src/behavioral/observer/UML.jpg)

# Mediator Pattern
[Refactoring Guru](https://refactoring.guru/design-patterns/mediator), [Digital Ocean](https://www.digitalocean.com/community/tutorials/mediator-design-pattern-java), [Java Spring Framework](https://springframework.guru/gang-of-four-design-patterns/mediator-pattern/)

## Overview
The Mediator pattern is a behavioral design pattern that defines an object that encapsulates how a set of objects interact with each other. The mediator object acts as an intermediary between the objects, allowing them to communicate with each other without being tightly coupled.

## Initial Problem
In object-oriented design, objects often need to communicate with each other to perform tasks or exchange information. However, if objects are tightly coupled, changes to one object can have a ripple effect on all the other objects it interacts with. This can make the code difficult to maintain and extend over time. The Mediator pattern solves this problem by encapsulating the interactions between objects in a separate mediator object. Each object only needs to know how to communicate with the mediator, and the mediator handles the rest.

## When to Apply
The Mediator pattern is useful in the following situations:

* When you have a complex system of objects that need to communicate with each other.
* When you want to reduce the coupling between objects.
* When you want to improve the maintainability and extensibility of your code.
* When you want to implement a publish-subscribe model, where objects can subscribe to events and receive notifications when those events occur.
* When you want to implement a chat or messaging system, where objects can send and receive messages through a central mediator.

In general, the Mediator pattern is useful in any situation where you want to decouple the interactions between objects, or where you want to implement a central hub for communication in a distributed system.

## UML Diagram

![Alt text](/src/behavioral/mediator/UML.jpg)

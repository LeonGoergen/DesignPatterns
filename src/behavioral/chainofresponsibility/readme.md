# Chain of Responsibility Pattern
[Refactoring Guru](https://refactoring.guru/design-patterns/chain-of-responsibility), [Digital Ocean](https://www.digitalocean.com/community/tutorials/chain-of-responsibility-design-pattern-in-java), [Java Spring Framework](https://springframework.guru/gang-of-four-design-patterns/chain-of-responsibility-pattern/)

## Overview
The Chain of Responsibility pattern is a behavioral design pattern that allows an object to pass a request along a chain of handlers until one of them handles the request. This pattern decouples the sender of the request from its receiver, allowing multiple objects to handle the request without the sender needing to know which object will handle it.

## Initial Problem
In object-oriented design, it is often necessary to handle a request or event in multiple stages or steps, with each step being handled by a different object. This can lead to tightly coupled code, where the sender of the request is dependent on the implementation of each step in the process. The Chain of Responsibility pattern solves this problem by creating a chain of objects, where each object is responsible for handling a specific part of the request. The sender of the request sends it to the first object in the chain, which passes it along to the next object, and so on, until the request is handled or the end of the chain is reached.

## When to Apply
The Chain of Responsibility pattern is useful in the following situations:

* When you want to decouple the sender of a request from its receiver, allowing multiple objects to handle the request without the sender needing to know which object will handle it.
* When you want to allow objects to be added or removed from the request handling chain dynamically at runtime.
* When you want to implement fault tolerance or failover mechanisms, where multiple objects can handle a request if one of them fails.
* When you want to implement a hierarchical processing system, where each object in the chain handles a specific level of processing.

In general, the Chain of Responsibility pattern is useful in any situation where you want to decouple the sender of a request from its receiver, or where you want to allow multiple objects to handle a request in a flexible and extensible way.

## UML Diagram
![Alt text](/src/behavioral/chainofresponsibility/UML.jpg)
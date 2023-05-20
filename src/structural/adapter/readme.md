# Adapter Pattern
[Refactoring Guru](https://refactoring.guru/design-patterns/adapter), [Digital Ocean](https://www.digitalocean.com/community/tutorials/adapter-design-pattern-java), [Java Spring Framework](https://springframework.guru/gang-of-four-design-patterns/adapter-pattern/)

## Overview
The Adapter pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate and work together. It acts as a bridge between two incompatible interfaces, converting the interface of one class into another interface that clients expect.

## Initial Problem
In software development, it is common to work with existing code or third-party libraries that have interfaces that are incompatible with the ones we need to use. This can make it challenging to integrate these components seamlessly into our system. The Adapter pattern solves this problem by providing a wrapper or intermediary class that translates the interface of one class into the expected interface of another. It allows objects with incompatible interfaces to work together without modifying their source code.

## When to Apply
The Adapter pattern is useful in the following situations:

* When you want to use a class that has a different interface than what your client code expects.
* When you need to reuse existing classes that have incompatible interfaces.
* When you want to create a reusable class that can work with multiple unrelated classes.
* When you want to decouple client code from the specifics of the classes it interacts with.

By applying the Adapter pattern, you can achieve better code reusability, maintainability, and flexibility by allowing different components to collaborate seamlessly, even if they have incompatible interfaces.

![Alt text](UML.png)
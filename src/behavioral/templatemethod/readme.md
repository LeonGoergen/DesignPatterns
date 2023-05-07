# Template Method Pattern
[Refactoring Guru](https://refactoring.guru/design-patterns/template-method), [Digital Ocean](https://www.digitalocean.com/community/tutorials/template-method-design-pattern-in-java), [Java Spring Framework](https://springframework.guru/gang-of-four-design-patterns/template-method-pattern/)

## Overview
The Template Method pattern is a behavioral design pattern that defines the skeleton of an algorithm in a base class, while allowing subclasses to override some of the steps of the algorithm without changing its structure.

## Initial Problem
In object-oriented design, it is often necessary to implement algorithms that have a fixed structure, but allow some of the steps to be customized by subclasses. One way to implement this is to define the algorithm in the base class and allow the subclasses to override the relevant steps. However, this can lead to code duplication and maintenance issues. The Template Method pattern solves this problem by defining the overall structure of the algorithm in a base class, while allowing subclasses to provide implementations for specific steps. This way, the algorithm can be easily customized without duplicating code or changing the overall structure.

## When to Apply
The Template Method pattern is useful in the following situations:

* When you need to implement an algorithm with a fixed structure, but some of the steps can be customized.
* When you want to avoid code duplication and maintainability issues that arise from implementing the algorithm in each subclass.
* When you want to provide a way for clients to extend the algorithm without changing its overall structure.

In general, the Template Method pattern is useful in any situation where you want to provide a framework for implementing algorithms with a fixed structure, while allowing some of the steps to be customized by subclasses. It can be particularly useful in situations where the algorithm involves complex and interrelated steps, and the customization needed for each step is relatively small.

## UML Diagram

![Alt text](/src/behavioral/templatemethod/UML.jpg)

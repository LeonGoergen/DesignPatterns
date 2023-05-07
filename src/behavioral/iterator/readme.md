# Iterator Pattern
## Overview
The Iterator pattern is a behavioral design pattern that provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. It defines a separate object (the iterator) that encapsulates the traversal logic, which can be used to iterate over a collection of objects.

## Initial Problem
In object-oriented programming, it is often necessary to iterate over the elements of a collection (e.g., an array or a list) without knowing the specific implementation details of the collection. However, different collections may have different implementations for iterating over their elements, which can make it difficult to write generic code that works with all types of collections. The Iterator pattern solves this problem by defining a separate object (the iterator) that encapsulates the traversal logic, allowing the client to iterate over the collection without knowing the implementation details of the collection.

## When to Apply
The Iterator pattern is useful in the following situations:

* When you need to traverse a collection of objects without exposing its underlying representation (e.g., to protect the collection from modification).
* When you want to provide a standard interface for iterating over different types of collections.
* When you want to iterate over a collection in a specific order (e.g., in reverse order).
* When you want to support multiple traversals of the same collection simultaneously.

In general, the Iterator pattern is useful in any situation where you need to traverse a collection of objects in a flexible and efficient way, without exposing the underlying implementation details of the collection.

## UML Diagram

![Alt text](/src/behavioral/iterator/UML.jpg)
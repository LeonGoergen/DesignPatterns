# Memento Pattern
## Overview
The Memento pattern is a behavioral design pattern that allows you to capture and externalize the state of an object without violating encapsulation. The pattern allows you to save and restore the state of an object, which can be useful for implementing undo/redo functionality or for providing checkpoints in a long-running process.

## Initial Problem
In object-oriented programming, it is often necessary to capture and store the state of an object for later use. This can be useful for implementing undo/redo functionality or for providing checkpoints in a long-running process. However, exposing the internal state of an object violates encapsulation and can lead to bugs and other issues. The Memento pattern solves this problem by providing a way to capture and externalize the state of an object without exposing its internals.

## When to Apply
The Memento pattern is useful in the following situations:

* When you need to capture the state of an object and store it for later use.
* When you need to provide undo/redo functionality in your application.
* When you need to provide checkpoints in a long-running process.
* When you want to provide a snapshot of the state of an object, which can be used for debugging or testing purposes.

In general, the Memento pattern is useful in any situation where you need to capture and store the state of an object without exposing its internals.

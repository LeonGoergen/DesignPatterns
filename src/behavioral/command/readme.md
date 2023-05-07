# Command Pattern
## Overview
The Command pattern is a behavioral design pattern that encapsulates a request or behavioral.command as an object, allowing the client to execute it without knowing anything about the receiver of the request or the operation being performed.

## Initial Problem
In object-oriented design, it is often necessary to issue requests to objects without having any knowledge of the operation being requested or the receiver of the request. This can lead to tightly coupled code, where the client code is dependent on the implementation of the receiver. The Command pattern solves this problem by encapsulating a request or behavioral.command as an object, allowing the client to interact with it through a well-defined interface. The receiver of the request is only aware of the interface and does not need to know anything about the client or the operation being performed.

## When to Apply
The Command pattern is useful in the following situations:

* When you need to decouple the requester of a behavioral.command from the object that executes the behavioral.command.
* When you want to implement undo/redo functionality in your application.
* When you need to implement a queue of requests, which can be executed sequentially or concurrently.
* When you want to implement logging or auditing of commands.

In general, the Command pattern is useful in any situation where you want to separate the responsibilities of issuing a request and executing it, or where you want to add flexibility to your code by allowing requests to be created, queued, and executed dynamically.

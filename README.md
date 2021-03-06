## FizzBuzz in several languages

Each language has a different implementation. This repo isn't only intented to practice implementing different versions of FizzBuzz, but also to gather minimal project testing setups in different languages.

### Java

The Java implementation is a stateful class with only one public method that iterates infinitely.

### Haskell

The Haskell implementation is a stateless function (functional programming yay!) that takes a number and return the "fizzbuzz equivalent" version.

### C++

The C++ implementation is a stateless class that exposes a method that can be called with anumber to get the "fizzbuzz" equivalent string. In this implementation the condition for adding "Fizz" and "Buzz" has been extracted to two virtual functions. This allows possible childs classes to behave correctly when using runtime polymorphism.

### Python

The Python implementation works just like the C++ one, but it uses a curious method (but obviously not optimal) to check if a number is multiple of 3 or 5.

### Rust

The Rust version is really similar to the Haskell one. One difference is that tests are placed in the same file as the fizzbuzz function, because this is what is considered idiomatic in Rust.

### Nim

The Nim version is a really simple function. It is unique in the sense that it can run at compile time. In fact the tests are also executed at compile time.

### Go

The Go version is also rather simple. I tried to use a helper struct to perform a different solution. This could have been a tuple, but Go doesn't have support for tuples. The tests in this version are placed with the files they test, because that seems to be the convention in go

### Ruby

A simple implementation using Rspec and Rake.

### TypeScript

The TS implementation uses a generator, which makes it different from the other ones. This one was developed with José Daniel Escánez Expósito.

### Zig

The Zig implementation is also a fairly simple implementation, but can be executed at compile time.

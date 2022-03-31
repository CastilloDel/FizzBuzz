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

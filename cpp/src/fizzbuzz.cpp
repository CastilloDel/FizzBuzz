#include "../headers/fizzbuzz.hpp"

FizzBuzz::FizzBuzz() {}

string FizzBuzz::get(int number) {
    if (number % 3 == 0) {
        return "Fizz";
    }
    if (number % 5 == 0) {
        return "Buzz";
    }
    return to_string(number);
}
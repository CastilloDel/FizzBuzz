#include "../headers/fizzbuzz.hpp"

FizzBuzz::FizzBuzz() {}

string FizzBuzz::get(int number) {
    if (number % 3 == 0) {
        return "Fizz";
    }
    return to_string(number);
}
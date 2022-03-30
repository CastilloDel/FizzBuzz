#include "../headers/fizzbuzz.hpp"

FizzBuzz::FizzBuzz() {}

string FizzBuzz::get(int number) {
    if (isFizz(number)) {
        return "Fizz";
    }
    if (isBuzz(number)) {
        return "Buzz";
    }
    return to_string(number);
}

bool FizzBuzz::isFizz(int number) {
    return number % 3 == 0;
}

bool FizzBuzz::isBuzz(int number) {
    return number % 5 == 0;
}
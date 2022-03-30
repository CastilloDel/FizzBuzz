#include "../headers/fizzbuzz.hpp"

FizzBuzz::FizzBuzz() {}

string FizzBuzz::get(int number) {
    string result;
    if (isFizz(number)) {
        result += "Fizz";
    }
    if (isBuzz(number)) {
        result += "Buzz";
    }
    return result.empty() ? to_string(number) : result;
}

bool FizzBuzz::isFizz(int number) {
    return number % 3 == 0;
}

bool FizzBuzz::isBuzz(int number) {
    return number % 5 == 0;
}
#include "../headers/fizzbuzz.hpp"

FizzBuzz::~FizzBuzz() {}

string FizzBuzz::get(int number) {
    string result;
    addFizz(number, result);
    addBuzz(number, result);
    return result.empty() ? to_string(number) : result;
}

bool FizzBuzz::isFizz(int number) {
    return number % 3 == 0;
}

bool FizzBuzz::isBuzz(int number) {
    return number % 5 == 0;
}

void FizzBuzz::addFizz(int number, string& result) {
    if (isFizz(number)) {
        result += "Fizz";
    }
}

void FizzBuzz::addBuzz(int number, string& result) {
    if (isBuzz(number)) {
        result += "Buzz";
    }
}
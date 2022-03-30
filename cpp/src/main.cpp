#include "../headers/fizzbuzz.hpp"
#include <iostream>

using std::cout;

int main() {
    FizzBuzz fizzbuzz;
    for (int i = 1; i <= 100; i++) {
        cout << fizzbuzz.get(i) << "\n";
    }
}
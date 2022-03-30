#include <gtest/gtest.h>
#include "../headers/fizzbuzz.hpp"

TEST(FizzBuzz, ReturnsExpectedNumber) {
  FizzBuzz fizzbuzz;
  EXPECT_EQ(fizzbuzz.get(4), "4");
  EXPECT_EQ(fizzbuzz.get(7), "7");
}

TEST(FizzBuzz, ReturnsFizzIfNumberIsMultipleOf3) {
  FizzBuzz fizzbuzz;
  EXPECT_EQ(fizzbuzz.get(3), "Fizz");
  EXPECT_EQ(fizzbuzz.get(18), "Fizz");
}

TEST(FizzBuzz, ReturnsBuzzIfNumberIsMultipleOf5) {
  FizzBuzz fizzbuzz;
  EXPECT_EQ(fizzbuzz.get(5), "Buzz");
  EXPECT_EQ(fizzbuzz.get(20), "Buzz");
}
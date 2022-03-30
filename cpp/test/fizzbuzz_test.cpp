#include <gtest/gtest.h>
#include "../src/fizzbuzz.hpp"

TEST(FizzBuzz, ReturnsExpectedNumber) {
  FizzBuzz fizzbuzz;
  EXPECT_EQ(fizzbuzz.get(4), std::string("4"));
}

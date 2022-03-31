import ../src/fizzbuzz

static: (fizzbuzz(1) == "1" and fizzbuzz(53) == "53")
    .assert "Doesn't return the correct number string"

static: (fizzbuzz(3) == "Fizz" and fizzbuzz(99) == "Fizz")
    .assert "Returns Fizz if number is a multiple of 3"

static: (fizzbuzz(5) == "Buzz" and fizzbuzz(100) == "Buzz")
    .assert "Returns Buzz if number is a multiple of 5"

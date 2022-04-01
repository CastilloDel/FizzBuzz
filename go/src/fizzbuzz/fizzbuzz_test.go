package fizzbuzz

import "testing"

func TestFizzBuzz(t *testing.T) {
	fizzbuzz := FizzBuzz{}

	t.Run("should return the same number as string", func(T *testing.T) {
		actual := fizzbuzz.get(1)
		if actual != "1" {
			t.Errorf("Actual: %s | Expected %s", actual, "1")
		}
		actual = fizzbuzz.get(127)
		if actual != "127" {
			t.Errorf("Actual: %s | Expected %s", actual, "127")
		}
	})

	t.Run("should return Fizz if number is divisible by 3", func(T *testing.T) {
		actual := fizzbuzz.get(3)
		if actual != "Fizz" {
			t.Errorf("Actual: %s | Expected %s", actual, "Fizz")
		}
		actual = fizzbuzz.get(333)
		if actual != "Fizz" {
			t.Errorf("Actual: %s | Expected %s", actual, "Fizz")
		}
	})

	t.Run("should return Buzz if number is divisible by 5", func(T *testing.T) {
		actual := fizzbuzz.get(5)
		if actual != "Buzz" {
			t.Errorf("Actual: %s | Expected %s", actual, "Buzz")
		}
		actual = fizzbuzz.get(550)
		if actual != "Buzz" {
			t.Errorf("Actual: %s | Expected %s", actual, "Buzz")
		}
	})

	t.Run("should return FizzBuzz if number is divisible by 3 and 5", func(T *testing.T) {
		actual := fizzbuzz.get(15)
		expected := "FizzBuzz"
		if actual != expected {
			t.Errorf("Actual: %s | Expected %s", actual, expected)
		}
		actual = fizzbuzz.get(555)
		if actual != expected {
			t.Errorf("Actual: %s | Expected %s", actual, expected)
		}
	})
}

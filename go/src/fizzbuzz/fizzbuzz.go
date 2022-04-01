package fizzbuzz

import "strconv"

type FizzBuzz struct{}

type DoubleCondition struct {
	b1 bool
	b2 bool
}

func (fizzbuzz *FizzBuzz) get(number int) string {
	conditions := DoubleCondition{number%3 == 0, number%5 == 0}
	switch conditions {
	case DoubleCondition{true, true}:
		return "FizzBuzz"
	case DoubleCondition{true, false}:
		return "Fizz"
	case DoubleCondition{false, true}:
		return "Buzz"
	default:
		return strconv.Itoa(number)
	}
}

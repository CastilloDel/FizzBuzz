package fizzbuzz

import "strconv"

type FizzBuzz struct{}

func (fizzbuzz *FizzBuzz) get(number int) string {
	if number%3 == 0 {
		return "Fizz"
	}
	if number%5 == 0 {
		return "Buzz"
	}
	return strconv.Itoa(number)
}

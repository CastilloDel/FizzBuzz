package fizzbuzz

import "strconv"

type FizzBuzz struct{}

func (fizzbuzz *FizzBuzz) get(number int) string {
	if number%3 == 0 {
		return "Fizz"
	}
	return strconv.Itoa(number)
}

package fizzbuzz

import "strconv"

type FizzBuzz struct{}

func (fizzbuzz *FizzBuzz) get(number int) string {
	return strconv.Itoa(number)
}

package main

import (
	"fizzbuzz/fizzbuzz"
	"fmt"
)

func main() {
	fizzbuzz := fizzbuzz.FizzBuzz{}
	for i := 1; i <= 100; i++ {
		fmt.Println(fizzbuzz.Get(i))
	}
}

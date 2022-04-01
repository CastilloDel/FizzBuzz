package fizzbuzz

import "testing"

func TestFizzBuzz(t *testing.T) {
	fizzbuzz := FizzBuzz{}
	expected := "1"
	actual := fizzbuzz.get(1)
	if expected != actual {
		t.Errorf(
			"Doesn't returns the same number as string: %s doesn't match %s",
			actual, expected,
		)
	}
}

package fizzbuzz

import "testing"

func TestFizzBuzz(t *testing.T) {
	fizzbuzz := FizzBuzz{}

	t.Run("should return the same number as string", func(T *testing.T) {
		actual := fizzbuzz.get(1)
		if actual != "1" {
			t.Errorf("Actual: %s | Expected %s", actual, "1")
		}
		actual = fizzbuzz.get(126)
		if actual != "126" {
			t.Errorf("Actual: %s | Expected %s", actual, "126")
		}
	})
}

import unittest

from src.fizzbuzz import FizzBuzz

class FizzBuzzTests(unittest.TestCase):
  def test_returns_number_string(self):
    fizzbuzz = FizzBuzz()
    self.assertEqual(fizzbuzz.to_fizzbuzz(1), '1')
    self.assertEqual(fizzbuzz.to_fizzbuzz(4), '4')

  def test_returns_fizz_if_multiple_of_3(self):
    fizzbuzz = FizzBuzz()
    self.assertEqual(fizzbuzz.to_fizzbuzz(3), 'Fizz')
    self.assertEqual(fizzbuzz.to_fizzbuzz(18), 'Fizz')
   

unittest.main()

import unittest

from src.fizzbuzz import FizzBuzz

class FizzBuzzTests(unittest.TestCase):
  def test_returns_number_string(self):
    fizzbuzz = FizzBuzz()
    self.assertEqual(fizzbuzz.to_fizzbuzz(1), '1')

unittest.main()

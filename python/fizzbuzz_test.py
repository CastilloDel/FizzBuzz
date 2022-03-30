import unittest

from src.fizzbuzz import FizzBuzz

class FizzBuzzTests(unittest.TestCase):
  def __init__(self, *args):
    super().__init__(*args)
    self.fizzbuzz = FizzBuzz()

  def test_returns_number_string(self):
    self.assertEqual(self.fizzbuzz.to_fizzbuzz(1), '1')
    self.assertEqual(self.fizzbuzz.to_fizzbuzz(4), '4')

  def test_returns_fizz_if_multiple_of_3(self):
    self.assertEqual(self.fizzbuzz.to_fizzbuzz(3), 'Fizz')
    self.assertEqual(self.fizzbuzz.to_fizzbuzz(18), 'Fizz')
    self.assertEqual(self.fizzbuzz.to_fizzbuzz(363), 'Fizz')

  def test_returns_buzz_if_multiple_of_5(self):
    self.assertEqual(self.fizzbuzz.to_fizzbuzz(5), 'Buzz')
    self.assertEqual(self.fizzbuzz.to_fizzbuzz(20), 'Buzz')
    self.assertEqual(self.fizzbuzz.to_fizzbuzz(425), 'Buzz')
   
  def test_returns_fizzbuzz_if_multiple_of_3_and_5(self):
    self.assertEqual(self.fizzbuzz.to_fizzbuzz(15), 'FizzBuzz')
    self.assertEqual(self.fizzbuzz.to_fizzbuzz(720), 'FizzBuzz')

unittest.main()

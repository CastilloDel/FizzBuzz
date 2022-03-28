module FizzBuzz where

fizzBuzz :: Int -> String
fizzBuzz n
  | n `mod` 3 == 0 = "Fizz"
  | n `mod` 5 == 0 = "Buzz"
  | otherwise = show n
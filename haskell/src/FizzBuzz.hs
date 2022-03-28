module FizzBuzz where

fizzBuzz :: Int -> String
fizzBuzz n
  | n `mod` 3 == 0 = "Fizz"
  | otherwise = show n
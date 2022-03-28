module FizzBuzz where

fizzBuzz :: Int -> String
fizzBuzz n = addDefault $ fizz ++ buzz
  where
    fizz
      | n `mod` 3 == 0 = "Fizz"
      | otherwise = ""
    buzz
      | n `mod` 5 == 0 = "Buzz"
      | otherwise = ""
    addDefault "" = show n
    addDefault s = s
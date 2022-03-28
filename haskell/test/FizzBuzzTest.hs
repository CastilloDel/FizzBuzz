module Main where

import FizzBuzz
import Test.Hspec

main :: IO ()
main = hspec fizzBuzzTests

fizzBuzzTests :: Spec
fizzBuzzTests = describe "Fizzbuzz behaviour" $ do
  it "Should return the correct number" $ do
    fizzBuzz 1 `shouldBe` "1"
    fizzBuzz 4 `shouldBe` "4"
  it "Should return Fizz if the number is multiple of 3" $ do
    fizzBuzz 3 `shouldBe` "Fizz"
    fizzBuzz 21 `shouldBe` "Fizz"
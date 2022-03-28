module Main where

import FizzBuzz
import Test.Hspec

main :: IO ()
main = hspec fizzBuzzTests

fizzBuzzTests :: Spec
fizzBuzzTests = describe "Fizzbuzz behaviour" $ do
  it "Should return the correct number" $
    fizzBuzz 1 `shouldBe` "1"
module Main where

import FizzBuzz

main :: IO ()
main = mapM_ print list
  where
    list = map fizzBuzz $ takeWhile (<= 100) $ iterate (+ 1) 1
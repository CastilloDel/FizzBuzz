import std/sequtils
import std/sugar
import fizzbuzz

const numbers = toSeq(0..100).map(x => fizzbuzz(x))
for num in numbers:
    echo num
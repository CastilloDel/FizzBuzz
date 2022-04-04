require_relative "../lib/fizzbuzz"

(1..100).map {|n| print (Fizzbuzz.get(n) + "\n")}
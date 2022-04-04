# frozen_string_literal: true

module Fizzbuzz
  VERSION=2
  def Fizzbuzz.get(number)
    fizz = isFizz(number)
    buzz = isBuzz(number)
    if fizz and buzz
      return "FizzBuzz"
    elsif fizz
      return "Fizz"
    elsif buzz
      return "Buzz"
    end
    number.to_s()
  end

  def Fizzbuzz.isFizz(number)
    number % 3 == 0
  end

  def Fizzbuzz.isBuzz(number)
    number % 5 == 0
  end
end

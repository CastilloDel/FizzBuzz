# frozen_string_literal: true

module Fizzbuzz
  VERSION=2
  def Fizzbuzz.get(number)
    if number % 3 == 0
      return "Fizz"
    end
    number.to_s()
  end
end


proc fizzbuzz*(number: int): string =
  if number mod 3 == 0:
    return "Fizz"
  $number
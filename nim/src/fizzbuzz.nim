
proc fizzbuzz*(number: int): string {.compileTime.} =
  if number mod 3 == 0:
    return "Fizz"
  if number mod 5 == 0:
    return "Buzz"
  $number
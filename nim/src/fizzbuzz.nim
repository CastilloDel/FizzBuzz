
proc fizzbuzz*(number: int): string {.compileTime.} =
  if number mod 3 == 0:
    result = "Fizz"
  if number mod 5 == 0:
    result &= "Buzz"
  if result == "":
    result = $number
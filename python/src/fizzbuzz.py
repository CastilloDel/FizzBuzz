class FizzBuzz():
  def to_fizzbuzz(self, number: int):
    copy = number
    digit_sum = 0
    while copy > 0:
      digit_sum += copy % 10
      copy //= 10
    if digit_sum in [3, 6, 9]:
      return 'Fizz'
    return str(number)
    
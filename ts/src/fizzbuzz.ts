export function* getFizzBuzzIterator(limit: number = 100) {
  for (let i = 1; i <= limit; i++) {
    if (i % 3 == 0) {
      yield "Fizz";
    } else if (i % 5 == 0) {
      yield "Buzz";
    } else {
      yield i.toString();
    }
  }
}

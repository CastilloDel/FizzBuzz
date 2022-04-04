export function* getFizzBuzzIterator(limit: number = 100) {
  for (let i = 1; i <= limit; i++) {
    let to_yield = "";
    if (i % 3 == 0) {
      to_yield = "Fizz";
    }
    if (i % 5 == 0) {
      to_yield += "Buzz";
    }
    yield to_yield === "" ? i.toString() : to_yield;
  }
}

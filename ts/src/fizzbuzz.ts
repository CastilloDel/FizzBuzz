export function* getFizzBuzzIterator(limit: number = 100) {
  for (let i = 1; i <= limit; i++) {
    yield i.toString();
  }
}

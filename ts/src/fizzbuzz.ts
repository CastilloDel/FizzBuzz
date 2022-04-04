export function* getFizzBuzzIterator() {
  for (let i = 1; i <= 100; i++) {
    yield i.toString();
  }
}

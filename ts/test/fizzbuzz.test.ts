import { getFizzBuzzIterator } from "../src/fizzbuzz";

test("", () => {
  const iterator = getFizzBuzzIterator();
  expect(iterator.next().value).toBe("1");
  expect(iterator.next().value).toBe("2");
});

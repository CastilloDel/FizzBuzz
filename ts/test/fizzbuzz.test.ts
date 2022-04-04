import { getFizzBuzzIterator } from "../src/fizzbuzz";

describe("Fizzbuzz", () => {
  test("Should count", () => {
    const iterator = getFizzBuzzIterator();

    expect(iterator.next().value).toBe("1");
    expect(iterator.next().value).toBe("2");
  });

  test("Should be possible to set an end for the iterator", () => {
    const limit = 23;
    const iterator = getFizzBuzzIterator(limit);

    let count = 0;
    for (const element of iterator) {
      count++;
    }

    expect(count).toBe(limit);
  });
});

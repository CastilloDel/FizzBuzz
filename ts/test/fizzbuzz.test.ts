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

  test("Should return Fizz when it is a multiple of 3", () => {
    const limit = 90;
    const iterator = getFizzBuzzIterator(limit);
    for (let i = 0; i < limit / 3; i++) {
      iterator.next();
      iterator.next();
      expect(iterator.next().value).toBe("Fizz");
    }
  });
});

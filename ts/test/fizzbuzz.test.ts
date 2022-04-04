import { getFizzBuzzIterator } from "../src/fizzbuzz";

describe("Fizzbuzz", () => {
  const limit = 90;

  test("Should count", () => {
    const iterator = getFizzBuzzIterator();

    expect(iterator.next().value).toBe("1");
    expect(iterator.next().value).toBe("2");
  });

  test("Should be possible to set an end for the iterator", () => {
    const iterator = getFizzBuzzIterator(limit);

    let count = 0;
    for (const element of iterator) {
      count++;
    }

    expect(count).toBe(limit);
  });

  const skip = (iterator: Generator, number: number) => {
    for (let i = 0; i < number - 1; i++) {
      iterator.next();
    }
    return iterator.next();
  };

  test("Should return Fizz when it is a multiple of 3", () => {
    const iterator = getFizzBuzzIterator(limit);

    expect(skip(iterator, 3).value).toBe("Fizz");
    expect(skip(iterator, 3).value).toBe("Fizz");
    expect(skip(iterator, 3 * 19).value).toBe("Fizz");
  });

  test("Should return Buzz when it is a multiple of 5", () => {
    const iterator = getFizzBuzzIterator(limit);

    expect(skip(iterator, 5).value).toBe("Buzz");
    expect(skip(iterator, 5).value).toBe("Buzz");
    expect(skip(iterator, 5 * 11).value).toBe("Buzz");
  });

  test("Should return FizzBuzz when it is a multiple of 3 and 5", () => {
    const iterator = getFizzBuzzIterator(limit);

    expect(skip(iterator, 3 * 5).value).toBe("FizzBuzz");
    expect(skip(iterator, 3 * 5 * 2).value).toBe("FizzBuzz");
    expect(skip(iterator, 3 * 5 * 3).value).toBe("FizzBuzz");
  });
});

import { getFizzBuzzIterator } from "./fizzbuzz";

const mainFizzBuzz = () => {
  for (const element of getFizzBuzzIterator()) {
    console.log(element);
  }
};

mainFizzBuzz();

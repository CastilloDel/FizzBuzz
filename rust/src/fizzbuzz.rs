fn get_fizzbuzz_equivalent(number: usize) -> String {
    let mut result = String::new();
    if number % 3 == 0 {
        result.push_str("Fizz");
    }
    if number % 5 == 0 {
        result.push_str("Buzz");
    }
    if result.is_empty() {
        return number.to_string();
    } else {
        return result;
    };
}

#[cfg(test)]
mod tests {
    use super::get_fizzbuzz_equivalent;
    #[test]
    fn should_return_the_number_in_string() {
        assert_eq!(get_fizzbuzz_equivalent(1), "1");
        assert_eq!(get_fizzbuzz_equivalent(124), "124");
    }

    #[test]
    fn should_return_fizz_if_multiple_of_3() {
        assert_eq!(get_fizzbuzz_equivalent(3), "Fizz");
        assert_eq!(get_fizzbuzz_equivalent(93), "Fizz");
    }

    #[test]
    fn should_return_buzz_if_multiple_of_5() {
        assert_eq!(get_fizzbuzz_equivalent(5), "Buzz");
        assert_eq!(get_fizzbuzz_equivalent(95), "Buzz");
    }

    #[test]
    fn should_return_fizzbuzz_if_multiple_of_3_and_5() {
        assert_eq!(get_fizzbuzz_equivalent(15), "FizzBuzz");
        assert_eq!(get_fizzbuzz_equivalent(90), "FizzBuzz");
    }
}

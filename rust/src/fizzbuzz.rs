fn get_fizzbuzz_equivalent(number: usize) -> String {
    if number % 3 == 0 {
        "Fizz".to_string()
    } else {
        number.to_string()
    }
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
}

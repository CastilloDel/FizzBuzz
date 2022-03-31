fn get_fizzbuzz_equivalent(number: usize) -> String {
    number.to_string()
}

#[cfg(test)]
mod tests {
    use super::get_fizzbuzz_equivalent;
    #[test]
    fn test() {
        assert_eq!(get_fizzbuzz_equivalent(1), "1");
        assert_eq!(get_fizzbuzz_equivalent(124), "124");
    }
}

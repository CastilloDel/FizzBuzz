mod fizzbuzz;
use fizzbuzz::get_fizzbuzz_equivalent;

fn main() {
    (0..=100).for_each(|n| println!("{}", get_fizzbuzz_equivalent(n)))
}

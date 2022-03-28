package fizzbuzz;

public class FizzBuzz {
    private int count;

    public FizzBuzz() {
        count = 0;
    }

    public String next() {
        count++;
        if (count == 3) {
            return "Fizz";
        } else if (count == 5) {
            return "Buzz";
        }
        return String.valueOf(count);
    }
}

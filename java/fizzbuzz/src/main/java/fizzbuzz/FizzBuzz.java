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
        }
        return String.valueOf(count);
    }
}

package fizzbuzz;

public class FizzBuzz {
    private int count;

    public FizzBuzz() {
        count = 0;
    }

    public String next() {
        count++;
        switch (count) {
            case 3:
                return "Fizz";
            case 5:
                return "Buzz";
            default:
                return String.valueOf(count);
        }
    }
}

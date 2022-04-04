package fizzbuzz;

public class FizzBuzz {
    private int count;

    public FizzBuzz() {
        count = 0;
    }

    public String next() {
        count++;
        return calculateString();
    }

    private String calculateString() {
        String result = "";
        if (isFizzNumber(count)) {
            result += "Fizz";
        }
        if (isBuzzNumber(count)) {
            result += "Buzz";
        }
        return result.isEmpty() ? String.valueOf(count) : result;
    }

    private boolean isFizzNumber(int count) {
        return count % 3 == 0;
    }

    private boolean isBuzzNumber(int count) {
        return count % 5 == 0;
    }
}

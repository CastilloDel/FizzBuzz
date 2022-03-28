package fizzbuzz;

public class FizzBuzz {
    private int count;

    public FizzBuzz() {
        count = 0;
    }

    public String next() {
        count++;
        String result = "";
        if (count % 3 == 0) {
            result += "Fizz";
        }
        if (count % 5 == 0) {
            result += "Buzz";
        }
        return result.isEmpty() ? String.valueOf(count) : result;
    }
}

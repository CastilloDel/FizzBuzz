package fizzbuzz;

public class FizzBuzz {
    private int count;

    public FizzBuzz() {
        count = 0;
    }

    public String next() {
        count++;
        return processResult();
    }

    private String processResult() {
        String result = "";
        if (isFizz(count)) {
            result += "Fizz";
        }
        if (isBuzz(count)) {
            result += "Buzz";
        }
        return result.isEmpty() ? String.valueOf(count) : result;
    }

    private boolean isFizz(int count) {
        return count % 3 == 0;
    }

    private boolean isBuzz(int count) {
        return count % 5 == 0;
    }
}

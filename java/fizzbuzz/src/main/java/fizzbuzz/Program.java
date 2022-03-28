package fizzbuzz;

public class Program {

    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        for (int i = 0; i < 100; i++) {
            System.out.println(fizzbuzz.next());
        }
    }
}

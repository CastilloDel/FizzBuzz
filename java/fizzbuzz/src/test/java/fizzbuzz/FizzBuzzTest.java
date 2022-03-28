package fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void shouldCount() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1", fizzbuzz.next());
    }

    @Test
    void shouldCountIndefinitely() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1", fizzbuzz.next());
        assertEquals("2", fizzbuzz.next());
    }

    @Test
    void shouldReturnFizzIfMultipleOf3() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.next();
        fizzbuzz.next();
        assertEquals("Fizz", fizzbuzz.next());
    }

}

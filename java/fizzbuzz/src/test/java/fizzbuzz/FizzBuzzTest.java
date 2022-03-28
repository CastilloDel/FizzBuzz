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
        fizzbuzz.next();
        fizzbuzz.next();
        assertEquals("Fizz", fizzbuzz.next());
    }

    @Test
    void shouldReturnBuzzIfMultipleOf5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        for (int i = 0; i < 4; i++) {
            fizzbuzz.next();
        }
        assertEquals("Buzz", fizzbuzz.next());
        for (int i = 0; i < 4; i++) {
            fizzbuzz.next();
        }
        assertEquals("Buzz", fizzbuzz.next());
    }

    @Test
    void shouldReturnFizzBuzzIfMultipleOf3And5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        for (int i = 0; i < 14; i++) {
            fizzbuzz.next();
        }
        assertEquals("FizzBuzz", fizzbuzz.next());
    }

}

package fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;

    @BeforeEach
    void initializeFizz() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    void shouldCount() {
        assertEquals("1", fizzbuzz.next());
    }

    @Test
    void shouldCountIndefinitely() {
        assertEquals("1", fizzbuzz.next());
        assertEquals("2", fizzbuzz.next());
    }

    @Test
    void shouldReturnFizzIfMultipleOf3() {
        skip(2);
        assertEquals("Fizz", fizzbuzz.next());
        skip(2);
        assertEquals("Fizz", fizzbuzz.next());
    }

    @Test
    void shouldReturnBuzzIfMultipleOf5() {
        skip(4);
        assertEquals("Buzz", fizzbuzz.next());
        skip(4);
        assertEquals("Buzz", fizzbuzz.next());
    }

    @Test
    void shouldReturnFizzBuzzIfMultipleOf3And5() {
        skip(14);
        assertEquals("FizzBuzz", fizzbuzz.next());
    }

    void skip(int toSkip) {
        for (int i = 0; i < toSkip; i++) {
            fizzbuzz.next();
        }
    }

}

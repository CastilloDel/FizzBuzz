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
        fizzbuzz.next();
        fizzbuzz.next();
        assertEquals("Fizz", fizzbuzz.next());
        fizzbuzz.next();
        fizzbuzz.next();
        assertEquals("Fizz", fizzbuzz.next());
    }

    @Test
    void shouldReturnBuzzIfMultipleOf5() {
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
        for (int i = 0; i < 14; i++) {
            fizzbuzz.next();
        }
        assertEquals("FizzBuzz", fizzbuzz.next());
    }

}

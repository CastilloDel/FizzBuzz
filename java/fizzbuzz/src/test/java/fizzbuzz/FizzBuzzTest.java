package fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void shouldCount() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(1, fizzbuzz.next());
    }

}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {


    @Test
    void getOrdinal() {
        assertAll(
                () -> assertEquals("th", Fibonacci.getOrdinal("11")),
                () -> assertEquals("st", Fibonacci.getOrdinal("21")),
                () -> assertEquals("nd", Fibonacci.getOrdinal("32")),
                () -> assertEquals("rd", Fibonacci.getOrdinal("43")),
                () -> assertEquals("th", Fibonacci.getOrdinal("55"))
        );
    }

    @Test
    void fibonacci() {
        assertAll(
                () -> assertEquals(55, Fibonacci.fibonacci(10)),
                () -> assertEquals(34, Fibonacci.fibonacci(9)),
                () -> assertEquals(21, Fibonacci.fibonacci(8)),
                () -> assertEquals(13, Fibonacci.fibonacci(7)),
                () -> assertEquals(8, Fibonacci.fibonacci(6))
        );


    }

}
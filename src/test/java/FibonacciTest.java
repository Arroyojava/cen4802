import Fibonacci.Fibonacci;
import Fibonacci.FibonacciException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FibonacciTest {

    /**
     * Test inputs are returning the expected ordinal
     */
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

    /**
     * Test inputs are returning the expected value
     */
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

    /**
     * Test negative inputs in the fibonacci method
     */
    @Test
    void testFibonacciNegativeNumber(){
        FibonacciException exception = assertThrows(FibonacciException.class,
                () -> Fibonacci.fibonacci(-1));
        assertEquals("Input must be a non-negative integer.", exception.getMessage());
    }


}



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialNumberCheckTest {
    @Test
    void factorialNumberCheckForGivenValues() {
        FactorialNumberCheck factorialNumber = new FactorialNumberCheck();
        int ans = factorialNumber.sendValue(4);
        assertEquals(24,ans);

    }

    @Test
    void factorialNumberForOne() {
        FactorialNumberCheck factorialNumber = new FactorialNumberCheck();
        int ans = factorialNumber.sendValue(1);
        assertEquals(1,ans);
    }

    @Test
    void factorialNumberForZero() {
        FactorialNumberCheck factorialNumber = new FactorialNumberCheck();
        int ans = factorialNumber.sendValue(0);
        assertEquals(-1,ans);

    }

    @Test
    void factorialNumberForAnotherValue() {
        FactorialNumberCheck factorialNumber = new FactorialNumberCheck();
        int ans = factorialNumber.sendValue(7);
        assertEquals(5040,ans);
    }

    @Test
    void factorialNumberForNegativeValues() {
        FactorialNumberCheck factorialNumber = new FactorialNumberCheck();
       int ans =  factorialNumber.sendValue(-3);
        assertEquals(-1,ans);
    }
}
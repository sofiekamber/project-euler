package test;

import main.Problem4;
import main.Problem5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Problem5Test {

    @Test
    void getSmallestMultipleWhichIsDivisibleUpTo_1to10_2520() {
        Problem5 problem5 = new Problem5();

        long result = problem5.getSmallestMultipleWhichIsDivisibleUpTo(1, 10);

        assertEquals(2520, result);
    }

    @Test
    void getSmallestMultipleWhichIsDivisibleUpTo_1to20_() {
        Problem5 problem5 = new Problem5();

        long result = problem5.getSmallestMultipleWhichIsDivisibleUpTo(1, 20);

        assertEquals(232792560, result);
    }

}

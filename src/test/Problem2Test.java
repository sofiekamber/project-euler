package test;

import main.Problem2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class Problem2Test {

    @Test
    void getSumOfEvenValuedTermsInFibonacciSequence_1and2below10_10() {
        Problem2 problem2 = new Problem2();

        assertSame(10, problem2.getSumOfEvenValuedTermsInFibonacciSequence(1, 2, 10));
    }

    @Test
    void getSumOfEvenValuedTermsInFibonacciSequence_1and2below4E6_4613732() {
        Problem2 problem2 = new Problem2();

        int result = problem2.getSumOfEvenValuedTermsInFibonacciSequence(1, 2, 4000000);

        assertEquals(4613732, result);
    }
}

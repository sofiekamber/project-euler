package test;

import main.Problem1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class Problem1Test {

    @Test
    void getSumOfMultiples_3and5_23() {
        Problem1 problem1 = new Problem1();

        assertSame(23, problem1.getSumOfTwoMultiplesBelowLimit(3, 5, 10));
    }

    @Test
    void getSumOfMultiples_3and5_result() {
        Problem1 problem1 = new Problem1();

        assertSame(233168, problem1.getSumOfTwoMultiplesBelowLimit(3, 5, 1000));
    }
}

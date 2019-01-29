package test;

import main.Problem2;
import main.Problem3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class Problem3Test {

    @Test
    void getLargestPrimeFactor_13195_29() {
        Problem3 problem3 = new Problem3();
        long valueToPartition = 13195;

        long largestPrimeFactor = problem3.getLargestPrimeFactor(valueToPartition);

        assertEquals(29, largestPrimeFactor);
    }

    @Test
    void getLargestPrimeFactor_600851475143_() {
        Problem3 problem3 = new Problem3();
        long valueToPartition = 600851475143L;

        long largestPrimeFactor = problem3.getLargestPrimeFactor(valueToPartition);

        System.out.println(largestPrimeFactor);
    }
}

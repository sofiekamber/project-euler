package test;

import main.Problem4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem4Test {

    @Test
    void getLargestPalindromeOfProduct_2digit_9009() {
        Problem4 problem4 = new Problem4();

        long result = problem4.getLargestPalindromeOfProduct(2);

        assertEquals(9009, result);
    }

    @Test
    void getLargestPalindromeOfProduct_3digit_() {
        Problem4 problem4 = new Problem4();

        long result = problem4.getLargestPalindromeOfProduct(3);

        System.out.println(result);
    }

}

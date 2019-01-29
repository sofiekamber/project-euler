package test;

import main.Problem5;
import main.Problem6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem6Test {

    @Test
    void getDifferenceBetweenSumOfSquaresAndSquareOfSum_10_2640() {
        Problem6 problem6 = new Problem6();

        long result = problem6.getDifferenceBetweenSumOfSquaresAndSquareOfSum(10);

        assertEquals(2640, result);
    }

    @Test
    void getDifferenceBetweenSumOfSquaresAndSquareOfSum_100_25164150() {
        Problem6 problem6 = new Problem6();

        long result = problem6.getDifferenceBetweenSumOfSquaresAndSquareOfSum(100);

        System.out.println(result);
    }

}

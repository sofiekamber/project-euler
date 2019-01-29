package test;

import main.Problem7;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem7Test {

    @Test
    void getPrimeNumber_6_13() {
        Problem7 problem7 = new Problem7();

        int result = problem7.getPrimeNumber(6);

        assertEquals(13, result);
    }

    @Test
    void getPrimeNumber_10001_104743() {
        Problem7 problem7 = new Problem7();

        int result = problem7.getPrimeNumber(10001);

        System.out.println(result);
    }

}

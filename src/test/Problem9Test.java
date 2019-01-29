package test;

import main.Problem8;
import main.Problem9;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem9Test {

    @Test
    void getProductOfPythagoreanTriplet_1000_31875000() {
        Problem9 problem9 = new Problem9();

        long result = problem9.getProductOfPythagoreanTriplet(1000);

        assertEquals(31875000, result);
    }

}

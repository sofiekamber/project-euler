package main;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem8 {

    public long getLargestProductOfAdjacentDigits(BigInteger largeNumber, int numOfDigits) {
        BigInteger tempLargeNumber = largeNumber;
        long largestProduct = 0;
        List<Integer> tempListOfDigits = new ArrayList<>();
        for (long i = 0; i < largeNumber.bitLength(); i++) {
            BigInteger remainder = tempLargeNumber.mod(new BigInteger("10"));
            if (tempListOfDigits.size() >= numOfDigits) {
                long product = getProductOfList(tempListOfDigits);
                if (product > largestProduct) {
                    largestProduct = product;
                }
                tempListOfDigits.remove(0);
            }
            tempListOfDigits.add(remainder.intValue());
            tempLargeNumber = tempLargeNumber.divide(new BigInteger("10"));
        }
        return largestProduct;
    }

    private long getProductOfList(List<Integer> integers) {
        long product = 1;
        for (Integer integer : integers) {
            product *= integer;
        }
        return product;
    }

}

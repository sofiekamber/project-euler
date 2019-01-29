package main;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {

    public int getPrimeNumber(int index) {
        List<Integer> primeNumbers = new ArrayList<>();
        Integer tempNumber = 0;
        while (primeNumbers.size() != index) {
            if (isPrimeNumber(tempNumber)) {
                primeNumbers.add(tempNumber);
            }
            tempNumber++;
        }
        return primeNumbers.get(index -1);
    }

    private boolean isPrimeNumber(long number) {
        if (number == 2) {
            return true;
        }
        if (number == 0 || number == 1 || number % 2 == 0) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}

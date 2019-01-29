package main;

public class Problem3 {

    public long getLargestPrimeFactor(long value) {
        long largestPrimeFactor = 0;
        for(long i = 0; i < Math.sqrt(value); i++) {
            if (isPrimeNumber(i)) {
                if(isDividableBy(value, i)) {
                    largestPrimeFactor = i;
                }
            }
        }
        return largestPrimeFactor;
    }

    private boolean isPrimeNumber(long value) {
        if (value == 0 || value ==1 || isDividableBy(value, 2)) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(value); i++) {
            if (isDividableBy(value, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isDividableBy(long value, long factor) {
        return value % factor == 0;
    }

}

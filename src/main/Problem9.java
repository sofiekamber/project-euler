package main;

public class Problem9 {

    public long getProductOfPythagoreanTriplet(long sumOfTriplet) {
        for (long a = 0; a <= sumOfTriplet; a++) {
            for (long b = 0; b <= sumOfTriplet; b++) {
                for (long c = 0; c <= sumOfTriplet; c++) {
                    if (sumOfTriplet == a + b + c) {
                        if (isPythagoreanTriplet(a, b, c)) {
                            return a * b * c;
                        }
                    }
                }
            }
        }
        throw new RuntimeException("No triplet found.");
    }

    private boolean isPythagoreanTriplet(long a, long b, long c) {
        return a < b && b < c && a * a + b * b == c * c;
    }

}

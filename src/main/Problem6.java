package main;

public class Problem6 {

    public long getDifferenceBetweenSumOfSquaresAndSquareOfSum(long limit) {
        return getSquareOfSum(limit) - getSumOfSquares(limit);
    }

    private long getSumOfSquares(long limit) {
        long sum = 0;
        for (long i = 1; i <= limit; i++) {
            sum += i*i;
        }
        return sum;
    }

    private long getSquareOfSum(long limit) {
        long sum = 0;
        for (long i = 1; i <= limit; i++) {
            sum += i;
        }
        return sum * sum;
    }

}

package main;

public class Problem2 {

    public int getSumOfEvenValuedTermsInFibonacciSequence(int firstTerm, int secondTerm, int limit) {
        int sum = 0;
        int secondLastTerm = firstTerm;
        int lastTerm = secondTerm;
        if (isEven(firstTerm)) {
            sum += firstTerm;
        }
        if (isEven(secondTerm)) {
            sum += secondTerm;
        }
        do {
            int nextTerm = secondLastTerm + lastTerm;
            if (nextTerm % 2 == 0) {
                sum += nextTerm;
            }
            secondLastTerm = lastTerm;
            lastTerm = nextTerm;
        } while(lastTerm <= limit);
        System.out.println(sum);
        return sum;
    }

    private boolean isEven(int value) {
        return value % 2 == 0;
    }

}

package main;

public class Problem1 {

    public int getSumOfTwoMultiplesBelowLimit(int multiple1, int multiple2, int limit) {
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            if (i % multiple1 == 0 || i % multiple2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
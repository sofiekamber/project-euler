package main;

public class Problem4 {

    public long getLargestPalindromeOfProduct(int numberOfDigits) {
        long largestPalindrome = 0;
        for (long i = getHighestNumber(numberOfDigits); i > 0; i--) {
            for (long j = getHighestNumber(numberOfDigits); j > 0; j--) {
                System.out.println(i + ", " + j);
                long product = i * j;
                if (isPalindrome(product)) {
                    if (largestPalindrome < product) {
                        largestPalindrome = product;
                    }
                }
            }
        }
        return largestPalindrome;
    }

    private int getHighestNumber(int numberOfDigits) {
        int highestNumber = 0;
        for (int i = 0; i < numberOfDigits; i++) {
            highestNumber = highestNumber * 10 + 9;
        }
        return highestNumber;
    }

    private boolean isPalindrome(long number) {
        long tempNumber = number;
        long reversedNumber = 0;
        while (tempNumber != 0) {
            long remainder = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            tempNumber /= 10;
        }
        return number == reversedNumber;
    }

}

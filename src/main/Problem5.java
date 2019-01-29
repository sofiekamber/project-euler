package main;

public class Problem5 {

    public long getSmallestMultipleWhichIsDivisibleUpTo(long startingDivider, long endingDivider) {
        long found = 0;
        long tempNum = 0;
        while(found == 0) {
            tempNum++;

            boolean tempFound = true;
            for (long i = startingDivider; i <= endingDivider; i++) {
                if (tempNum % i != 0) {
                    tempFound = false;
                    break;
                }
            }
            if (tempFound) {
                found = tempNum;
            }
        }
        return found;
    }

}

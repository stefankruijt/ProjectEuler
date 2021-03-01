package problem10;

import Helpers.NumberUtil;

public class Solution {
    public static void main(String[] args) {
        new Solution();
    }

    private final long MAX_PRIME = 2000000;

    public Solution() {
        long result = 0;
        for(int i=2; i<MAX_PRIME; i++) {
            if(NumberUtil.isPrime(i)) {
                result += i;
                System.out.println("Prime found: " + i);
            }
        }
        System.out.println("The result is: " + result);
    }
}
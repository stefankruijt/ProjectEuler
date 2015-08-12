package problem1;

import java.util.stream.IntStream;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * solution1 uses a Java8 stream while solution2 uses for loops.
 */
public class Solution {
    public static int solution1(int N)
    {
        return IntStream.range(0, N)
                .parallel()
                .filter(n -> divisibleBy3(n) || divisibleBy5(n))
                .sum();
    }

    public static int solution2(int N)
    {
        int result = 0;
        for(int i=0; i<N; i++) {
            if(i%3==0 || i%5==0) result += i;
        }
        return result;
    }

    private static boolean divisibleBy3(int n) {
        return n%3 == 0;
    }

    private static boolean divisibleBy5(int n) {
        return n%5 == 0;
    }
}

package problems.problem6;

import java.util.stream.IntStream;

public class Solution {

    public static int Solution(int N) {
        int result = squareOfSum(N) - sumOfSquares(N);
        return result;
    }

    private static int sumOfSquares(int N) {
        return IntStream.iterate(1, i -> i+1)
                .limit(N)
                .map(i -> i * i)
                .sum();
    }

    private static int squareOfSum(int N) {
        return (int) Math.pow(IntStream.iterate(1, i -> i +1)
                .limit(N)
                .sum(), 2);
    }
}

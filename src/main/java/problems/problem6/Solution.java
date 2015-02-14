package problems.problem6;

public class Solution {

    public static final int N = 100;

    public static int Solution() {
        int result = squareOfSum(N) - sumOfSquares(N);
        return result;
    }

    public static int sumOfSquares(int N) {
        int result = 0;
        for(int i=1; i<=N; i++) {
            result += (i*i);
        }
        return result;
    }

    public static int squareOfSum(int N) {
        int result = 0;
        for(int i=1; i<=N; i++) {
            result += i;
        }
        result = result * result;
        return result;
    }
}

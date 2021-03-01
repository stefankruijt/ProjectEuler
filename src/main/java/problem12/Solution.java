package problem12;

public class Solution {

    public static void main(String[] args) {
        new Solution();
    }

    public Solution() {

    }

    /**
     * Returns the total value of the nth triangular number
     * For the definition of triangle number see: https://en.wikipedia.org/wiki/Triangular_number
     * @return value of the Nth triange number
     */
    public static int getTriangleNumber(int n) {
        if(n <= 1)
            return n;
        return n + getTriangleNumber(n - 1);
    }
}

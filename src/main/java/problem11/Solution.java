package problem11;

public class Solution {
    public final int GRID_SIZE = 20;
    public final int NUMBERS_IN_PRODUCT = 4;

    public static void main(String[] args) {
        new Solution();
    }

    public Solution() {
        int[][] numbers = InputReader.readInput("src/main/java/problem11/input.txt", GRID_SIZE);
        System.out.println("Greatest product is: " + findGreatestProduct(numbers));
    }

    public int findGreatestProduct(int[][] numbers) {
        int max = 0;

        for (int row=0; row<GRID_SIZE; row++) {
            for(int col=0; col< GRID_SIZE; col++) {
                // horizontal
                if (col <= GRID_SIZE - NUMBERS_IN_PRODUCT) {
                    int product = numbers[row][col] * numbers[row][col+1] * numbers[row][col+2] * numbers[row][col+3];
                    max = (product > max) ? product : max;
                }

                // vertical
                if (row <= GRID_SIZE - NUMBERS_IN_PRODUCT) {
                    int product = numbers[row][col] * numbers[row+1][col] * numbers[row+2][col] * numbers[row+3][col];
                    max = (product > max) ? product : max;
                }

                // diagonally downwards / forwards
                if (col <= GRID_SIZE - NUMBERS_IN_PRODUCT && row <= GRID_SIZE-NUMBERS_IN_PRODUCT) {
                    int product = numbers[row][col] * numbers[row+1][col+1] * numbers[row+2][col+2] * numbers[row+3][col+3];
                    max = (product > max) ? product : max;
                }

                // diagonally downward / backward
                if (col >= NUMBERS_IN_PRODUCT-1 && row <= GRID_SIZE - NUMBERS_IN_PRODUCT) {
                    int product = numbers[row][col] * numbers[row+1][col-1] * numbers[row+2][col-2] * numbers[row+3][col-3];
                    max = (product > max) ? product : max;
                }
            }
        }
        return max;
    }
}
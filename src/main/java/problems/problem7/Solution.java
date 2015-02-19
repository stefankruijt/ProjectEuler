package problems.problem7;

public class Solution {
    // We're going to search for the N st prime number
    public static int Solution(int N) {
        System.out.println("Let's find the " + N + "th prime number!");
        boolean found = false;
        int solutionNumber = 0;
        int i = 2;
        while(!found) {
            if (isPrime(i)) {
                solutionNumber++;
                if(solutionNumber == N) {
                    System.out.println("We found it!");
                    found = true;
                }
                else {
                    System.out.println("Didn't found it yet, I'm trying " + i + " now.");
                    i++;
                }
            }
            else {
                i++;
            }
        }
        System.out.println("We found the " + N + "th prime number! It's " + i);
        return i;
    }

    /*
     * Method to check whether an integer number is prime.
     * @return true if number is prime, else false
     */
    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }

        for(int i=2; i<=Math.sqrt(number); i++) {
            if(number%i==0) {
                return false;
            }
        }
        return true;
    }
}
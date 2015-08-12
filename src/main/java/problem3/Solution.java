package problem3;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Solution {

   public static long Solution(long number) {
      for(long n = (long) Math.floor(Math.sqrt(number)); n>1; n--) {
         if(isPrime(n) && number%n==0) {
            return n;
         }
      }
      return 0;
   }

   public static boolean isPrime(long number) {

      if (number <= 3) return number > 1;

      for(int n = (int) Math.floor(Math.sqrt(number)); n>1; n--) {
         if(number % n == 0) {
            return false;
         }
      }
      return true;
   }
}

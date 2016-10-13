package problem4;

// A palindromic number reads the same both ways.
// The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.
public class Solution {
   private final int DEFAULT_NUMBER_OF_DIGITS = 3;

   /* This program by default searches for largest palindrome made from the product of two 3-digit numbers
      This program can also be used to search for palindromes made from 2-digit numbers or more than 3-digit numbers
      by giving the amount of digits as a commandline parameter when executing this program.
   */
   public static void main(String[] args) {
      new Solution(args);
   }

   public Solution(String[] args) {
      int numberOfDigits = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_NUMBER_OF_DIGITS;
      findMaxPalindrome(numberOfDigits);
   }

   // Constructor used for unit testing in MaxPalindromeFinderTest.java
   public Solution() {
   }

   public long findMaxPalindrome(int numberOfDigits) {
      long maxPalindrome = 0;
      int number1 = 0;
      int number2 = 0;
      int startValue = (int) Math.pow(10, numberOfDigits);

      for(int a=startValue; a>0; a--) {
         for(int b=startValue; b>a; b--) {
            int product = a * b;

            if (product <= maxPalindrome) {
               break;
            }

            if(isPalindrome(product) && product > maxPalindrome) {
               maxPalindrome = product;
               number1 = a;
               number2 = b;
            }
         }
      }

      System.out.println(String.format("The largest palindrome made from the product of two %d-digit numbers is %d = %d × %d.",
              numberOfDigits, maxPalindrome, number1, number2));

      return maxPalindrome;
   }

   protected boolean isPalindrome(long number) {
      return number == reverse(number);
   }

   private long reverse(long n) {
      long reverse = 0;

      while(n > 0) {
         int lastDigit = (int) n % 10;
         reverse = reverse * 10 + lastDigit;
         n = n / 10;
      }
      return reverse;
   }
}
package problem4;

// A palindromic number reads the same both ways.
// The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.
public class Solution {

   public static long Solution() {

      long answer = 0;

      for(int i=999; i>0; i--) {
         for(int j=999; j>0; j--) {
            if(isPalindrome(i*j)) {
               if(i*j > answer) {
                  answer = i * j;
               }
               else {
                  break;
               }
            }
         }
      }
      System.out.println(answer);
      return answer;
   }

   public static boolean isPalindrome(long number) {
      String numberString = number + "";
      String reversedNumberString = "";

      for(char character : numberString.toCharArray())
      {
         reversedNumberString = character + reversedNumberString;
      }

      return reversedNumberString.equals(numberString);
   }
}

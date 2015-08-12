package problem5;

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?


public class Solution {

   public static long Solution() {
      boolean resultFound = false;
      int number = 20;

      while(!resultFound) {
         boolean devisibleByAll = true;
         number++;
         for(int i=1; i<=20; i++)
         {
            if(number%i!=0) {
               devisibleByAll = false;
               break;
            }
         }
         if(devisibleByAll) {
            resultFound = true;
         }
      }
      return number;
   }
}

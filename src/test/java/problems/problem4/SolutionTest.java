package problems.problem4;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

   static Logger log = Logger.getLogger(SolutionTest.class.getName());

   @Test
   public void testAnswer() {
      long answer = Solution.Solution();
      System.out.println("The solution is: " + answer);
   }

   @Test
   public void testIsPalindrome() {
      Assert.assertTrue(problems.problem4.Solution.isPalindrome(10001));
      Assert.assertTrue(problems.problem4.Solution.isPalindrome(404));
      Assert.assertTrue(problems.problem4.Solution.isPalindrome(456654));
      Assert.assertFalse(problems.problem4.Solution.isPalindrome(1234));
      Assert.assertFalse(problems.problem4.Solution.isPalindrome(1100));
      Assert.assertFalse(problems.problem4.Solution.isPalindrome(1002));
   }
}
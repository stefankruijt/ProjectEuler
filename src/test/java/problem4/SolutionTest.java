package problem4;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

   @Test
   public void testAnswer() {
      long answer = new Solution().findMaxPalindrome(3);
      Assert.assertTrue(new Solution().isPalindrome(10001));
   }

   @Test
   public void testIsPalindrome() {
      Assert.assertTrue(new Solution().isPalindrome(10001));
      Assert.assertTrue(new Solution().isPalindrome(404));
      Assert.assertTrue(new Solution().isPalindrome(456654));
      Assert.assertFalse(new Solution().isPalindrome(1234));
      Assert.assertFalse(new Solution().isPalindrome(1100));
      Assert.assertFalse(new Solution().isPalindrome(1002));
   }
}
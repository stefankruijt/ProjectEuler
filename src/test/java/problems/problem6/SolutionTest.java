package problems.problem6;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

   static Logger log = Logger.getLogger(SolutionTest.class.getName());

   @Test
   public void testAnswer() {
      long answer = Solution.Solution();
      System.out.println("The solution is: " + answer);

      Assert.assertEquals(answer, 25164150);
   }
}
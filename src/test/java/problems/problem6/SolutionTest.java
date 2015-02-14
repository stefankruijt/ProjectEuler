package problems.problem6;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

   static Logger log = Logger.getLogger(SolutionTest.class.getName());

   @Test
   public void testAnswer() {
       Assert.assertEquals(Solution.Solution(10), 2640);
       Assert.assertEquals(Solution.Solution(100), 25164150);
   }
}
package problems.problem1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class SolutionTest {

    static Logger log = Logger.getLogger(SolutionTest.class.getName());

    @Test
    public void testSolution() {
        int answer = Solution.solution();
        log.info("Solution for problen #1 is: " + answer);
        Assert.assertEquals(233168, Solution.solution());
    }

    @Test
    public void testWrongSolution() {
        Assert.assertFalse(Solution.solution() == 50);
    }
}
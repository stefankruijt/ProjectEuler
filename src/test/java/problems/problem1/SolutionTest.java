package problems.problem1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class SolutionTest {

    static Logger log = Logger.getLogger(SolutionTest.class.getName());

    @Test
    public void testSolution() {
        int answer = Solution.solution();
        log.info("Solution for problem #1 is: " + answer);
        Assert.assertEquals(233168, answer);
    }

    @Test
    public void testWrongSolution() {
        Assert.assertFalse(Solution.solution() == 50);
    }
}
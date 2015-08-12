package problem1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class SolutionTest {

    static Logger log = Logger.getLogger(SolutionTest.class.getName());

    @Test
    public void testSolution1() {
        long timeBefore = System.currentTimeMillis();
        int answer = Solution.solution1(1000);
        long timeAfter = System.currentTimeMillis();

        log.info("Solution1 took " + (timeAfter - timeBefore) + " millisecond");

        Assert.assertEquals(233168, answer);
    }

    @Test
    public void testSolution2() {
        long timeBefore = System.currentTimeMillis();
        int answer = Solution.solution2(1000);
        long timeAfter = System.currentTimeMillis();

        log.info("Solution2 took " + (timeAfter - timeBefore) + " millisecond");

        Assert.assertEquals(233168, answer);
    }
}
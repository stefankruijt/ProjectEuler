package problems.problem2;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import problems.problem1.Solution;

public class SolutionTest {

    static Logger log = Logger.getLogger(SolutionTest.class.getName());

    @Test
    public void testSolution() {
        int answer = problems.problem2.Solution.calculateFibonacciSum(1,2);
        log.info("Solution for problem #2 is: " + answer);
        Assert.assertEquals(4613732, answer);
    }
}
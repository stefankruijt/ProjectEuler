package problems.problem7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testAnswer() {
        Assert.assertEquals(problems.problem7.Solution.Solution(10001), 104743);
    }

    @Test
    public void testPrime() {
        Assert.assertEquals(problems.problem7.Solution.isPrime(1), false);
        Assert.assertEquals(problems.problem7.Solution.isPrime(2), true);
        Assert.assertEquals(problems.problem7.Solution.isPrime(3), true);
        Assert.assertEquals(problems.problem7.Solution.isPrime(4), false);
        Assert.assertEquals(problems.problem7.Solution.isPrime(5), true);
        Assert.assertEquals(problems.problem7.Solution.isPrime(6), false);
        Assert.assertEquals(problems.problem7.Solution.isPrime(7), true);
        Assert.assertEquals(problems.problem7.Solution.isPrime(11), true);
        Assert.assertEquals(problems.problem7.Solution.isPrime(13), true);
    }
}
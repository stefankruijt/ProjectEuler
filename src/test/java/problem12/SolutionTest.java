package problem12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testAnswer() {
        Assert.assertEquals(problem7.Solution.Solution(10001), 104743);
    }

    @Test
    public void testGetTriangleNumber() {
        Assert.assertEquals(problem12.Solution.getTriangleNumber(1), 1);
        Assert.assertEquals(problem12.Solution.getTriangleNumber(2), 3);
        Assert.assertEquals(problem12.Solution.getTriangleNumber(3), 6);
        Assert.assertEquals(problem12.Solution.getTriangleNumber(4), 10);
        Assert.assertEquals(problem12.Solution.getTriangleNumber(5), 15);
        Assert.assertEquals(problem12.Solution.getTriangleNumber(6), 21);
        Assert.assertEquals(problem12.Solution.getTriangleNumber(7), 28);
        Assert.assertEquals(problem12.Solution.getTriangleNumber(8), 36);
        Assert.assertEquals(problem12.Solution.getTriangleNumber(9), 45);
        Assert.assertEquals(problem12.Solution.getTriangleNumber(10), 55);
    }
}
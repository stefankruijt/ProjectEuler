package NumberUtil;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Helpers.NumberUtil.*;

public class NumberUtilTest {
    @Test
    public void isPrimeTest() {
        Assert.assertTrue(isPrime(2));
        Assert.assertTrue(isPrime(3));
        Assert.assertTrue(isPrime(5));
        Assert.assertTrue(isPrime(577));
        Assert.assertTrue(isPrime(641));

        Assert.assertFalse(isPrime(6));
        Assert.assertFalse(isPrime(15));
        Assert.assertFalse(isPrime(100));
        Assert.assertFalse(isPrime(250));
        Assert.assertFalse(isPrime(578));
    }

    @Test
    public void isEvenTest() {
        Assert.assertTrue(isEven(0));
        Assert.assertTrue(isEven(2));
        Assert.assertTrue(isEven(4));
        Assert.assertTrue(isEven(100));
        Assert.assertTrue(isEven(-40));

        Assert.assertFalse(isEven(1));
        Assert.assertFalse(isEven(3));
        Assert.assertFalse(isEven(177));
        Assert.assertFalse(isEven(-55));
    }

    @Test
    public void isOddTest() {
        Assert.assertTrue(isOdd(1));
        Assert.assertTrue(isOdd(3));
        Assert.assertTrue(isOdd(7));
        Assert.assertTrue(isOdd(101));
        Assert.assertTrue(isOdd(-101));

        Assert.assertFalse(isOdd(0));
        Assert.assertFalse(isOdd(2));
        Assert.assertFalse(isOdd(66));
        Assert.assertFalse(isOdd(-50));
    }

    @Test
    public void isDivisibleTest() {
        Assert.assertTrue(isDivisible(2, 2));
        Assert.assertTrue(isDivisible(10, 5));
        Assert.assertTrue(isDivisible(15, 3));
        Assert.assertTrue(isDivisible(100, -20));

        Assert.assertFalse(isDivisible(1, 2));
        Assert.assertFalse(isDivisible(7, 3));
    }


    @Test(expectedExceptions = { IllegalArgumentException.class })
    public void isDivisibleTestDivideByZero() {
        isDivisible(2, 0);
        isDivisible(0, 0);
        isDivisible(-2, 0);
    }

    @Test
    public void getNumberOfDivisorsTest() {
        Assert.assertEquals(getNumberOfDivisors(1), 1);
        Assert.assertEquals(getNumberOfDivisors(3), 2);
        Assert.assertEquals(getNumberOfDivisors(6), 4);
        Assert.assertEquals(getNumberOfDivisors(10), 4);
        Assert.assertEquals(getNumberOfDivisors(15), 4);
        Assert.assertEquals(getNumberOfDivisors(21), 4);
        Assert.assertEquals(getNumberOfDivisors(28), 6);
    }
}
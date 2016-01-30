package PrimeUtil;

import Helpers.PrimeUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class PrimeUtilTest {
    @Test
    public void isPrimeTest() {
        Assert.assertTrue(PrimeUtil.isPrime(2));
        Assert.assertTrue(PrimeUtil.isPrime(3));
        Assert.assertTrue(PrimeUtil.isPrime(5));
        Assert.assertTrue(PrimeUtil.isPrime(577));
        Assert.assertTrue(PrimeUtil.isPrime(641));

        Assert.assertFalse(PrimeUtil.isPrime(6));
        Assert.assertFalse(PrimeUtil.isPrime(15));
        Assert.assertFalse(PrimeUtil.isPrime(100));
        Assert.assertFalse(PrimeUtil.isPrime(250));
        Assert.assertFalse(PrimeUtil.isPrime(578));
    }
}
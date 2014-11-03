package problems.problem3;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

   static Logger log = Logger.getLogger(SolutionTest.class.getName());

   @Test
   public void testAnswer() {
      Assert.assertEquals(Solution.Solution(600851475143L), 6857L);
      Assert.assertEquals(Solution.Solution(24L), 12);
   }

   @Test
   public void testPrimeNumbers() {
      Assert.assertFalse(Solution.isPrime(1));
      Assert.assertFalse(Solution.isPrime(6));
      Assert.assertFalse(Solution.isPrime(20));
      Assert.assertFalse(Solution.isPrime(1000));
      Assert.assertFalse(Solution.isPrime(6540));
      Assert.assertFalse(Solution.isPrime(7920));

      Assert.assertTrue(Solution.isPrime(2));
      Assert.assertTrue(Solution.isPrime(3));
      Assert.assertTrue(Solution.isPrime(5));
      Assert.assertTrue(Solution.isPrime(7));
      Assert.assertTrue(Solution.isPrime(11));
      Assert.assertTrue(Solution.isPrime(503));
      Assert.assertTrue(Solution.isPrime(997));
      Assert.assertTrue(Solution.isPrime(7919));

   }
}
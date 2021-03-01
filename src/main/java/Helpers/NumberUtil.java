package Helpers;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class NumberUtil {
    private static IntPredicate isOdd = argument -> argument % 2 != 0;
    private static IntPredicate isEven = argument -> argument % 2 == 0;

    public static boolean isPrime(int n) {
        IntPredicate isDivisible = argument -> n % argument == 0;
        return n > 1 && IntStream.range(2, n).noneMatch(isDivisible);
    }

    public static boolean isOdd(int n) {
        return isOdd.test(n);
    }

    public static boolean isDivisible(int n, int divisor) {
        if(divisor == 0) {
            throw new IllegalArgumentException("Divide by 0 is impossible");
        }
        IntPredicate isDivisible = argument -> n % divisor == 0;
        return isDivisible.test(n);
    }

    public static boolean isEven(int n) {
        return isEven.test(n);
    }

    /**
     * @param n
     * @return total number of divisors of number n
     */
    public static long getNumberOfDivisors(int n) {
        IntStream allNumbers = IntStream.rangeClosed(1, n);

        return allNumbers
                .filter(num -> NumberUtil.isDivisible(n, num))
//              .peek((num -> System.out.println("Filtered value: " + num)))
                .count();
    }
}

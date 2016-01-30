package Helpers;

public class PrimeUtil {
    public static boolean isPrime(int number) {
        for(int n=2; n <= (number / 2); n++) {
            if(n == number) {
                continue;
            }

            if(number % n == 0) {
                return false;
            }
        }
        return true;
    }
}

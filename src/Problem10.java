
/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

public class Problem10 {
    public static void main(String[] args) {
        long sumOfPrimes = 0;
        for (int i = 2; i < 2_000_000; i++)
            if (Methods.isPrime(i))
                sumOfPrimes += i;
        System.out.println(sumOfPrimes);
    }
}

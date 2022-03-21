
/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */

public class Problem7 {
    public static void main(String[] args) {
        int countOfPrimes = 6;

        for (int i = 14; i <= 105_000; i++) {
            if (Metotlar.isPrime(i))
                countOfPrimes++;
            if (countOfPrimes == 10_001) {
                System.out.println("10 001st prime number is: " + i);
                break;
            }
        }
    }
}

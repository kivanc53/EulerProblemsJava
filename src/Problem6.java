
/*
The sum of the squares of the first ten natural numbers is,
1'2 + 2'2 + ... + 10'2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)'2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and
the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers
and the square of the sum.
 */

public class Problem6 {
    public static void main(String[] args) {
        System.out.println("difference between the sum of the squares of the first 100 " +
                "natural numbers and the square of the sum is: "
                + (findSquareOfSum(100) - findSumOfSquare(100)));
    }

    public static int findSquareOfSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++)
            sum += i;
        return sum * sum;
    }

    public static int findSumOfSquare(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++)
            sum += i * i;
        return sum;
    }


}


/*
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */

public class Problem30 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < 1_000_000; i++)
            if (fifthPowersOfDigits(i))
                sum += i;
        System.out.println(sum);
    }

    public static boolean fifthPowersOfDigits(int val) {
        int sum = 0, temp = val;
        while (val != 0) {
            sum += Math.pow(val % 10, 5);
            val /= 10;
        }
        return sum == temp;
    }
}

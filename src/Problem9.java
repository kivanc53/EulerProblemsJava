
/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class Problem9 {
    public static void main(String[] args) {
        for (int i = 1; i < 999; i++) {
            for (int j = 2; j < 999; j++) {
                for (int k = 3; k < 999; k++) {
                    if (checkSquare(i, j, k))
                        break;
                }
            }

        }
    }

    public static boolean checkSquare(int val1, int val2, int val3) {
        if (val1 * val1 + val2 * val2 == val3 * val3 && val2 > val1) {
            if (val1 + val2 + val3 == 1000) {
                System.out.printf("%d'2 + %d'2 = %d'2\n", val1, val2, val3);
                System.out.printf("%d * %d * %d = %d", val1, val2, val3, val1 * val2 * val3);
                return true;
            }
        }
        return false;
    }
}


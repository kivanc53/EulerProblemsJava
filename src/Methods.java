import java.math.BigInteger;
import java.util.ArrayList;

public class Methods {
    public static boolean isPrime(int value) {
        if (value <= 1)
            return false;
        if (value % 2 == 0)
            return value == 2;
        if (value % 3 == 0)
            return value == 3;
        if (value % 5 == 0)
            return value == 5;
        if (value % 7 == 0)
            return value == 7;
        if (value % 11 == 0)
            return value == 11;

        for (int i = 13; i * i <= value; i += 2)
            if (value % i == 0)
                return false;
        return true;
    }

    public static boolean isPolindrome(int val) {
        return val == getReverse(val);
    }

    public static int getReverse(int val) {
        int newVal = 0;
        while (val != 0) {
            newVal = newVal * 10 + val % 10;
            val /= 10;
        }
        return newVal;
    }

    public static BigInteger sumOfDigits(BigInteger number) {
        BigInteger sum = new BigInteger("0");
        while (number.compareTo(BigInteger.ZERO) != 0) {
            sum = sum.add(number.remainder(BigInteger.TEN));
            number = number.divide(BigInteger.TEN);
        }
        return sum;
    }

    public static int countOfDigits(BigInteger v) {
        int count = 0;
        while (!v.equals(BigInteger.ZERO)) {
            v = v.divide(BigInteger.TEN);
            count++;
        }
        return count;
    }

    public static int sumOfDivisors(int value) {
        int sum = 0;
        for (int i = 1; i < value; i++)
            if (value % i == 0)
                sum += i;
        return sum;
    }
}

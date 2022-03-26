import java.math.BigInteger;

/*
215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2'1000?
 */

public class Problem16 {
    public static void main(String[] args) {

        BigInteger num = new BigInteger("2");
        System.out.println("2'1000 sayısının basamaklarının toplamı: " + Methods.sumOfDigits(num.pow(1000)));

    }
}

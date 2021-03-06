import java.math.BigInteger;
/*
The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:
F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class Problem25 {
    public static void main(String[] args) {
        BigInteger firstValue = new BigInteger("1");
        BigInteger secondValue = new BigInteger("1");
        for (int i = 3; i < 5000; i++) {
            BigInteger temp = secondValue;
            secondValue = secondValue.add(firstValue);
            firstValue = temp;
            if (Methods.countOfDigits(secondValue) >= 1000) {   //bu if basamak kontrolü içindir.
                System.out.println(i);
                break;
            }
        }
    }
}

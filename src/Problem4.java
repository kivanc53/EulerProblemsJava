
/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Problem4 {
    public static void main(String[] args) {
        int largest = 0;
        for (int i = 999; i >= 900; i--)
            for (int k = 999; k >= 900; k--)
                if (Methods.isPolindrome(i * k) && (i * k) > largest) {
                    System.out.println(i + " " + k);
                    largest = i * k;
                }
        System.out.println(largest);
    }
}

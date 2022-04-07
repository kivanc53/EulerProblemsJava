/*
A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:
1/2	= 	0.5
1/3	= 	0.(3)
1/4	= 	0.25
1/5	= 	0.2
1/6	= 	0.1(6)
1/7	= 	0.(142857)
1/8	= 	0.125
1/9	= 	0.(1)
1/10	= 	0.1
Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.
Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
 */

// virgülden kurtulmamız lazım. bu yüzden 1 i sayıya değil 10 u sayıya bölüyoruz.

import java.util.ArrayList;

public class Problem26 {
    public static void main(String[] args) {
        int count, temp = 0, longest = 0;

        for (int denominator = 10; denominator > 1; denominator--) {
            count = findLongest(denominator);
            if (count > longest) {
                longest = count;
                temp = denominator;
            }
        }
        System.out.println(temp);
    }

    public static int findLongest(int denominator) {
        ArrayList<Integer> list = new ArrayList<>();
        int numerator = 1;
        while (true) {
            numerator *= 10;
            if (!list.contains(numerator / denominator)) //bölen
                list.add(numerator / denominator);      //bölen
            else
                return list.size();
             numerator = numerator * 10 % denominator ;
        }
    }
}
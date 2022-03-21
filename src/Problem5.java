
/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class Problem5 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 2520; i <= 300_000_000; i +=210) {
            for (int k = 1; k <= 20; k++) {
                if (i % k == 0) {
                    count++;
                    if (count == 20)
                        System.out.println(i);
                } else {
                    count = 1;
                    break;
                }
            }
        }
    }
}

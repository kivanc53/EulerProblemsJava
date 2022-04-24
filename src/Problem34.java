public class Problem34 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 3; i < 1_000_000; i++)
            if (checkCurious(i))
                result += i;
        System.out.println(result);
    }

    public static boolean checkCurious(int n) {
        return n == check(n);
    }

    public static int check(int n) {
        int sum = 0;
        while (n != 0) {
            sum += Methods.factorial(n % 10);
            n /= 10;
        }
        return sum;
    }
}

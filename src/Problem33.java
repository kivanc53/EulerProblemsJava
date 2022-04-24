public class Problem33 {
    public static void main(String[] args) {
        int payda = 1;
        int pay = 1;

        for (int i = 1; i < 10; i++) {
            for (int pyd = 1; pyd < i; pyd++) {
                for (int p = 1; p < pyd; p++) {
                    if ((p * 10 + i) * pyd == p * (i * 10 + pyd)) {
                        payda *= pyd;
                        pay *= p;
                    }
                }
            }
        }
        payda /= commonDivisorOf2Numbers(pay, payda);
        System.out.println(payda);
    }

    //iki sayının ortak bölenlerini böyle buluyoruz.
    public static int commonDivisorOf2Numbers(int a, int b) {
        if (a == 0)
            return b;

        return commonDivisorOf2Numbers(b % a, a);
    }
}

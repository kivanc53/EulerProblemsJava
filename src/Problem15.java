
/*
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
there are exactly 6 routes to the bottom right corner.
How many such routes are there through a 20×20 grid?

Tekrarlı permütasyon da =>>        toplam yol!
                            ------------------------
                             düşey yol! * yatay yol!

 */
public class Problem15 {
    public static void main(String[] args) {
        java.util.Scanner isim = new java.util.Scanner(System.in);
        System.out.println("enter n: ");
        int n = isim.nextInt();
        findRoutes(n);

    }

    public static int[] createUpperBound(int n) {
        int[] topArray = new int[n];

        int count = n + 1;
        for (int i = 0; i < n; i++) {
            topArray[i] = count;
            count++;
        } //n+1 den n*2 ye kadar array e atadık
        return topArray;
    }

    public static int[] createLowerBound(int n) {
        int[] subArray = new int[n];

        int count = 1;
        for (int i = 0; i < n; i++) {
            subArray[i] = count;
            count++;
        }// 1 den n dahil atadık.
        return subArray;
    }


    public static long findResult(int[] topArray, int[] subArray) {
        long numerator, denominator;
        numerator = multiply(topArray);
        denominator = multiply(subArray);

        if (denominator == 0)
            return numerator;
        return numerator / denominator;

    }

    public static long multiply(int[] array) {
        long result = 1;
        for (int j : array)
            if (j != 0)
                result *= j;
        if (result == 1)
            return 0;
        return result;
    }


    public static void findRoutes(int n) {

        int[] topArray = createUpperBound(n);
        int[] subArray = createLowerBound(n);

        for (int i = 0; i < topArray.length; i++) {
            if (Methods.isPrime(topArray[i]))
                continue;
            else for (int k = 0; k < subArray.length; k++) {
                if (subArray[k] == 0)
                    continue;
                else if (topArray[i] % subArray[k] == 0) {

                    topArray[i] = topArray[i] / subArray[k];
                    subArray[k] = 0;
                }
            }
        }

        System.out.println(findResult(topArray, subArray));

    }
}


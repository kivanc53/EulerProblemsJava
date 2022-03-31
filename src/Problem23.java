import java.util.ArrayList;

public class Problem23 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int limit = 28124, sum = 0;
        int sumOf2Abundant;

        ArrayList<Integer> listOfAbundantNumbers = new ArrayList<>();
        ArrayList<Integer> sumOfAbundantNumbers = new ArrayList<>();

        for (int i = 0; i < limit; i++)
            if (isAbundant(i))
                listOfAbundantNumbers.add(i);

        for (int i = 0; i < listOfAbundantNumbers.size(); i++) {
            for (int k = i; k < listOfAbundantNumbers.size(); k++) {
                sumOf2Abundant = listOfAbundantNumbers.get(i) + listOfAbundantNumbers.get(k);
                if (sumOf2Abundant < limit)
                    sumOfAbundantNumbers.add(sumOf2Abundant);
            }
        }


        for (int i = 1; i < limit; i++)
            if (!sumOfAbundantNumbers.contains(i))
                sum += i;

        System.out.println(sum);
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double seconds = (double)estimatedTime/1000;
        System.out.println(seconds);
    }

    public static boolean isAbundant(int n) {
        int sumOfDivisors = Methods.sumOfDivisors(n);
        return sumOfDivisors > n;
    }
}

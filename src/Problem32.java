import java.util.ArrayList;

public class Problem32 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1000; i < 1_000_000; i++) {
            if (isPandigital(i))
                sum += i;
        }
        System.out.println(sum);
    }

    public static boolean isPandigital(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = n;
        while (n != 0) {
            int x = n % 10;
            if (list.contains(x) || x < 1)
                return false;
            else
                list.add(x);
            n /= 10;
        }
        return check(temp, list);
    }

    public static boolean check(int val, ArrayList<Integer> list) {
        for (int i = 10; i < 100; i++)
            for (int k = 100; k < 1000; k++)
                if (i * k == val)
                    if (check2(i, k, list))
                        return true;
                    else
                        break;
        for (int i = 1; i < 10; i++)
            for (int k = 1000; k < 10000; k++)
                if (i * k == val)
                    if (check2(i, k, list))
                        return true;
                    else
                        break;
        return false;
    }

    public static boolean check2(int n, int h, ArrayList<Integer> list) {
        ArrayList<Integer> tempList = new ArrayList<>(list);
        while (n != 0) {
            int x = n % 10;
            if (tempList.contains(x) || x < 1)
                return false;
            else
                tempList.add(x);
            n /= 10;
        }
        while (h != 0) {
            int x = h % 10;
            if (tempList.contains(x) || x < 1)
                return false;
            else
                tempList.add(x);
            h /= 10;
        }
        return true;
    }
}

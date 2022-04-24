public class Problem35 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 3; i < 1000000; i += 2) {
            if (Methods.isPrime(i))
                if (isCircularPrime(i)) {
                    count++;
                }
        }
        System.out.println(count);
    }

    public static boolean isCircularPrime(int n) {
        if (n < 100) {
            return Methods.isPrime(Methods.getReverse(n));
        } else {
            if (!checkZero(n)) {
                return false;
            } else {
                int temp = n;
                for (int i = 0; i < Methods.countOfDigits(n) - 1; i++) {
                    if (Methods.isPrime(arrayToNumber(rotateArrayTo1Left(numberToArray(temp)))))
                        temp = arrayToNumber(rotateArrayTo1Left(numberToArray(temp)));
                    else
                        return false;
                }
                return true;
            }
        }
    }

    public static int arrayToNumber(int[] array) {
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            value += (array[i] * Math.pow(10, array.length - 1 - i));
        }
        return value;
    }

    public static boolean checkZero(int n) {
        while (n != 0) {
            if (n % 10 == 0)
                return false;
            n /= 10;
        }
        return true;
    }

    public static int[] numberToArray(int n) {
        int[] array = new int[Methods.countOfDigits(n)];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = n % 10;
            n /= 10;
        }
        return array;
    }

    public static int[] rotateArrayTo1Left(int[] array) {
        int temp = array[0];
        System.arraycopy(array, 1, array, 0, array.length - 1);
        array[array.length - 1] = temp;
        return array;
    }
}

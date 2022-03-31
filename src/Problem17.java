/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */

public class Problem17 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 1000; i++)
            sum += numbers(i);
        System.out.println(sum);
    }


    public static int numbers(int val) {
        String str = "";
        if (val < 13)
            str += oneTo12(val); //okay
        else if (val == 14)
            str += "fourteen";
        else if (val < 20)
            str = str + twelveTo20(val % 10) + "teen"; //okay
        else if (val < 100)
            str = str + twelveTo20(val / 10) + "ty" + oneTo12(val % 10); //okay
        else if (val < 1000) {
            str = str + oneTo12(val / 100) + "hundred";
            if (val % 100 != 0) {
                str = str + "and";
                if ((val % 100) < 13)
                    str += oneTo12(val % 100); //okay
                else if ((val % 100) == 14)
                    str += "fourteen";
                else if ((val % 100) < 20)
                    str = str + twelveTo20(((val % 100) % 10)) + "teen"; //okay
                else str = str + twelveTo20(((val % 100) / 10)) + "ty" + oneTo12(val % 10); //okay
            }
        } else
            str += "onethousand";

        return str.length();
    }

    public static String oneTo12(int number) {
        switch (number) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
        }
        return "";
    }

    public static String twelveTo20(int number) {
        switch (number) {
            case 2:
                return "Twen";
            case 3:
                return "Thir";
            case 4:
                return "For";
            case 5:
                return "Fif";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eigh";
            case 9:
                return "Nine";
        }
        return "";
    }
}

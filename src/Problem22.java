/*
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem22 {
    public static void main(String[] args) throws IOException {
        //"C:\\Users\\MSI\\OneDrive\\Euler Problemleri\\p022_names.txt"
        //"C:\\Users\\atmaca53\\OneDrive\\Euler Problemleri\\p022_names.txt"

        //dosyadan yazı okunması
        FileReader fileReader = new FileReader("C:\\Users\\MSI\\OneDrive\\Euler Problemleri\\p022_names.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String stringInFile = br.readLine();

        String[] array = new String[5163];

        divideStringByEnteredCharacter(stringInFile, ",", array);
        alphabeticalOrder(array);
        System.out.println(findScore(array));


    }

    public static void divideStringByEnteredCharacter(String str, String ch, String[] array) {
        int count = 0;

        StringTokenizer tokenizer = new StringTokenizer(str, ch);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            array[count] = token;
            count++;
        }
    }

    public static void alphabeticalOrder(String[] array) {

        for (int i = 0; i < array.length; i++)
            for (int k = 0; k < array.length - 1; k++)
                if (array[k].compareToIgnoreCase(array[k + 1]) > 0) {
                    String temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
    }

    public static long findScore(String[] array) {
        long sum = 0, largest = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length(); k++)
                sum = sum + (Character.getNumericValue(array[i].charAt(k)) - 9);
            largest = largest + (sum * (i + 1));
            sum = 0;
        }
        return largest;
    }

}

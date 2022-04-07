/*

Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?

    soruda () ile işaretli kısımlar tek sayıların karesi diye gidiyor. 1^2 , 3^2 , 5^2
    burada küçük küçük kareler düşünüyoruz. ve önemli olan kısımlar köşeler.

    sağ-üst köşe: n^2
    sol-üst köşe: n^2 - n + 1
    sağ-alt köşe: n^2 - 3n + 3
    sol-alt köşe: n^2 - 2n + 2

    Bu formüllerle köşelerdeki değerleri bulabiliriz.
    Ortada da 1 olduğu için bu formülü hesapladıktan sonra 1 eklenmelidir.
    Toplam formül: (4(n^2) - 6n + 6 ) + 1
 */

public class Problem28 {
    public static void main(String[] args) {
        int limit = 1001;

        int sum = 1;
        for (int i = 3; i <= limit; i += 2)
            sum += (4 * Math.pow(i, 2)) - (6 * i) + 6;

        System.out.println(sum);
    }
}

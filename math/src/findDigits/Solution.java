package findDigits;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 1/4/14
 * Time: 6:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), n;
        while (0 < T--) {
            n = sc.nextInt();
            findDigits(n);
        }
    }

    private static void findDigits(int number) {
        int dummy = number, count = 0, digit;
        while (dummy > 0) {
            digit = dummy % 10;
            dummy /= 10;
            if (digit > 0 && number % digit == 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
package serviceLane;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 1/4/14
 * Time: 5:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {

    private static int[] widths;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), T = sc.nextInt();
        widths = new int[N];
        for (int i = 0; i < N; i++) {
            widths[i] = sc.nextInt();
        }
        while (0 < T--) {
            printMaximum(sc.nextInt(), sc.nextInt());
        }
    }

    private static void printMaximum(int start, int end) {
        int max = widths[start];
        for (int i = start; i < end; ) {
            if (widths[++i] < max) {
                max = widths[i];
            }
            if (max == 1) {
                System.out.println(max);
                return;
            }
        }
        System.out.println(max);
    }
}
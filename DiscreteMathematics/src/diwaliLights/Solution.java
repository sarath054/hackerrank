package diwaliLights;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 12/30/13
 * Time: 3:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (0 < T--) {
            printLights(sc.nextInt());
        }
    }

    public static void printLights(int N) {
        int prod = 1;
        for (int i = 0; i < N; i++) {
            prod *= 2;
            prod %= 100000;
        }
        System.out.println(prod - 1);
    }
}
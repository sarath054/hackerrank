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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), N;
        long ways;
        while (0<T--){
            N =sc.nextInt();
            ways=(long)Math.pow(2, N)-1;
            System.out.println(ways%100000);
        }
    }
}

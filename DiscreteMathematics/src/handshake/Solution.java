package handshake;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 12/30/13
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N;
        while(0<T--){
            N = sc.nextInt();
            System.out.println(N*(N-1)/2);
        }
    }
}

package connectingTowns;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 12/29/13
 * Time: 9:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        int N, ways = 1;
        for (int i=0; i<T; i++){
            N=sc.nextInt();
            for(int j=1; j<N; j++){
                ways*=sc.nextInt();
                ways %= 1234567;
            }
            System.out.println(ways);
            ways = 1;
        }
    }
}

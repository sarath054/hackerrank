package coinage;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 1/4/14
 * Time: 4:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), N, A,B,C,D;
        Coinage coinage;
        while (0<T--){
            coinage = new Coinage(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            coinage.printWays();
        }
    }
}

class Coinage{
    private int money;
    private int countOf1;
    private int countOf2;
    private int countOf5;
    private int countOf10;
    private int ways = 0;

    Coinage(int c, int A, int B, int C, int D){
        money = c;
        countOf1 = A;
        countOf2 = B;
        countOf5 = C;
        countOf10 = D;
        countTotalWays();
    }

    private static int upperBound(int sum, int coinValue, int coinCount){
        return Math.min(sum/coinValue, coinCount);
    }

    private void countTotalWays(){
        int bound10, bound5, bound2, rem;
        bound10 = upperBound(money, 10, countOf10);
        for (int i=bound10; i>=0; i--){
            rem = money-10*i;
            bound5 = upperBound(rem, 5, countOf5);
            for (int j=bound5; j>=0; j--){
                rem = money - 10*i - 5*j;
                bound2 = upperBound(money-10*i-5*j, 2, countOf2);
                for (int k=bound2; k>=0; k--){
                    rem = money - 10*i - 5*j -2*k;
                    if(rem >=0 && countOf1>=rem){
                        ways++;
                    }
                }
            }
        }
    }

    void printWays(){
        System.out.println(ways);
    }

}
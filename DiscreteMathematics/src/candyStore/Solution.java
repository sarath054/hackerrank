package candyStore;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 1/4/14
 * Time: 1:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), N, k;
        KCandyStore kStore;
        while (0 < T--) {
            N = sc.nextInt();
            k = sc.nextInt();
            kStore = new KCandyStore(N, k);
            kStore.calculateWays();
            kStore.printWays();
        }
    }
}

class KCandyStore {
    private int N;
    private int k;
    private BigInteger noOfWays = BigInteger.ZERO;
    private BigInteger[] nCrArray;
    private BigInteger modulo = BigInteger.valueOf(1000000000);

    KCandyStore(int N, int k) {
        this.N = N;
        this.k = k;
        this.nCrArray = new BigInteger[k + 1];
    }

    void printWays() {
        System.out.println(noOfWays.mod(modulo));
    }

    void calculateWays() {
        for (int i = 0; i <= k; i++) {
            nCrArray[i] = calculateNCR(i);
            noOfWays = noOfWays.add(nCrArray[i]);
        }
    }

    private BigInteger calculateNCR(int index) {
        if (index == 0) {
            return BigInteger.ONE;
        } else {
            return nCrArray[index - 1].multiply(BigInteger.valueOf(N - 2 + index)).divide(BigInteger.valueOf(index));
        }
    }
}
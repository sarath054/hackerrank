package nCrTable;

import java.math.BigInteger;
import java.util.Date;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 1/4/14
 * Time: 10:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), n;
        while (0 < T--) {
            n = sc.nextInt();
            new NCRTable(n);
        }
    }
}

class NCRTable {
    private int N;
    private BigInteger[] table;
    private static BigInteger modulo = BigInteger.valueOf(1000000000);

    NCRTable(int N) {
        this.N = N;
        this.table = new BigInteger[N + 1];
        this.buildTable();
        this.printTable();
    }

    void buildTable() {
        for (int i = 0; i <= N; i++) {
            table[i] = nCr(i);
        }
    }

    void printTable() {
        for (int i = 0; i < N; i++) {
            System.out.print(table[i].mod(modulo) + " ");
        }
        System.out.println(table[N].mod(modulo));
    }

    BigInteger nCr(int r) {
        if (r == 0)
            return BigInteger.ONE;
        if (r > N / 2)
            return table[N - r];
        return (table[r - 1]).multiply(BigInteger.valueOf(N - r + 1)).divide(BigInteger.valueOf(r));
    }
}
package sayingHi;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/10/13
 * Time: 9:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args) {
        HiFinder hf = new HiFinder();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while (0 < N--) {
            hf.printIfHiFound(scanner.nextLine().toString());
        }
    }
}

class HiFinder {
    void printIfHiFound(String string) {
        if(string.matches("[hH][iI]\\s(?!d).*"))
            System.out.println(string);
    }
}

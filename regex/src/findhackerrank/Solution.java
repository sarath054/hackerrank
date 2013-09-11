package findhackerrank;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/9/13
 * Time: 5:09 PM
 */
public class Solution {
    public static void main(String[] args){
        // new FindHackerrank Object
        Solution fhr = new Solution();
        // Scanner to read inputs
        Scanner scanner = new Scanner(System.in);
        // number of inputs
        int N = Integer.parseInt(scanner.nextLine());
        while(0<N--){
            System.out.println(fhr.hackerPosition(scanner.nextLine().toString()));
        }
    }

    public int hackerPosition(String str){
        boolean starts = str.toLowerCase().startsWith("hackerrank");
        boolean ends = str.toLowerCase().endsWith("hackerrank");
        if(starts&&ends){
            return 0;
        }else if(starts){
            return 1;
        }else if(ends){
            return 2;
        }
        return -1;
    }
}
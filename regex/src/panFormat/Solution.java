package panFormat;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/10/13
 * Time: 9:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        FormatValidator fv = new FormatValidator();
//        fetch the number of pan numbers from STDIN
        int N = Integer.parseInt(scanner.nextLine());
        while(0<N--){
            fv.validateFormat(scanner.next().toString());
        }
    }
}

class FormatValidator{
    void validateFormat(String panNumber){
        System.out.println((panNumber.matches("[A-Z]{5,5}[0-9]{4,4}[A-Z]"))?"YES":"NO");
    }
}

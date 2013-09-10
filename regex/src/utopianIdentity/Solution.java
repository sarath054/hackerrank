package utopianIdentity;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/10/13
 * Time: 2:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        UidVerify uidVerify = new UidVerify();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while(0 < N--){
            System.out.println((uidVerify.verifyId(scanner.nextLine()))? "VALID":"INVALID");
        }
    }
}

class UidVerify{
    boolean verifyId(String uid){
        return uid.matches("[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}");
    }
}

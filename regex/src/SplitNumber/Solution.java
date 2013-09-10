package SplitNumber;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/10/13
 * Time: 5:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        PhoneNumberSplitter phoneNumberSplitter = new PhoneNumberSplitter();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while (0 < N--){
            phoneNumberSplitter.printPhoneNumberInGroups(scanner.nextLine());
        }
    }
}

class PhoneNumberSplitter{
    private boolean debugMode = false;
    void printPhoneNumberInGroups(String phoneNumber){
        String[] strings = phoneNumber.split("\\s|-");
        if(debugMode){
            System.out.println(phoneNumber);
        }
        System.out.println("CountryCode="+strings[0]+",LocalAreaCode="+strings[1]+",Number="+strings[2]);
    }
}

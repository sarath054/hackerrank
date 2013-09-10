package AlienUsername;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/10/13
 * Time: 5:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        AlienUNameValidator alienUNameValidator = new AlienUNameValidator();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while (0 < N--){
            alienUNameValidator.validateName(scanner.nextLine());
        }
    }
}

class AlienUNameValidator {
    private boolean debugMode = false;
    void validateName(String userName){
        boolean valid = userName.matches("[_\\.][0-9]+[a-zA-Z]*(_|\\b)");
        if(debugMode){
            System.out.println(userName);
            System.out.println(valid);
        }
        System.out.println((valid)?"VALID":"INVALID");
    }
}

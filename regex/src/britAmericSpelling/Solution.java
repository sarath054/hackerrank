package britAmericSpelling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/10/13
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        SpellingIdentify spellingIdentify = new SpellingIdentify();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while(0 < N--){
            spellingIdentify.buildStrings(scanner.nextLine());
        }
        int T = Integer.parseInt(scanner.nextLine());
        while(0 < T--){
            spellingIdentify.printOccurrences(scanner.nextLine());
        }
    }
}

class SpellingIdentify{
    private boolean debugMode = false;
    private ArrayList<String> strings =new ArrayList<String>();
    void buildStrings(String string){
        strings.addAll(Arrays.asList(string.split(" ")));
        if(debugMode) {
            System.out.println(string);
            printStringsBuilt();
        }
    }
    void printOccurrences(String key){
        int len = strings.size(), count = 0;
        String match = key.replace("ze","") +"[sz]e";
        for(int i=len-1; i>=0; i--){
            if(strings.get(i).matches(match)){
                if(debugMode)System.out.println(strings.get(i));
                count++;
            }
        }
        System.out.println(count);
    }
    void printStringsBuilt(){
            System.out.println(strings);
    }
}

package UKUS2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/10/13
 * Time: 4:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        UKUSIdentify ukusIdentify = new UKUSIdentify();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while (0 < N--){
            ukusIdentify.buildString(scanner.nextLine());
        }
        int T = Integer.parseInt(scanner.nextLine());
        while (0 < T--){
            ukusIdentify.findOccurrences(scanner.nextLine().toString());
        }
    }
}

class UKUSIdentify{
    private ArrayList<String> strings = new ArrayList<String>();
    private boolean debugMode = false;
    void buildString(String string){
        strings.addAll(Arrays.asList(string.split(" ")));
        if(debugMode){
            System.out.println(string);
            System.out.println(strings);
        }

    }

    void findOccurrences(String key){
        key = key.replace("our", "o(u){0,1}r");
        int len = strings.size(), count = 0;
        for(int i=len-1; i>=0; i--){
            if(strings.get(i).matches(key)){
                if(debugMode){
                    System.out.println(strings.get(i));
                }
                count++;
            }
        }
        if(debugMode){
            System.out.println(key);
        }
        System.out.println(count);
    }
}

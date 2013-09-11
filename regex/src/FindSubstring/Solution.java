package FindSubstring;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/11/13
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        FindSubStrings findSubStrings = new FindSubStrings();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while (0 < N--){
            findSubStrings.buildWords(scanner.nextLine());
        }
        int T = Integer.parseInt(scanner.nextLine());
        while (0 < T--){
            findSubStrings.printSubCount(scanner.nextLine());
        }
    }
}

class FindSubStrings{
    private ArrayList<String> wordsList = new ArrayList<String>();
    void buildWords(String inputString){
        String[] strings = inputString.split("\\W");
        int len = strings.length;
        for (int i=0; i<len; i++){
            if(!"".equals(strings[i].trim()))wordsList.add(strings[i].trim());
        }
    }
    void printSubCount(String sub){
        int count = 0, len = wordsList.size();
        for (int i=0; i<len ;i++){
            if(isSubOf(sub,wordsList.get(i))){
                count++;
            }
        }
        System.out.println(count);
    }

    boolean isSubOf(String sub, String word){
        return word.matches("\\w+"+sub+"\\w+");
    }
}

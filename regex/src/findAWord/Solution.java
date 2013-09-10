package findAWord;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/10/13
 * Time: 10:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        WordFinder wf = new WordFinder();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while(0 < N--){
            wf.buildWords(scanner.nextLine().toString());
        }
        int T = Integer.parseInt(scanner.nextLine());
        while(0 < T--){
            wf.printOccurrence(scanner.nextLine().toString());
        }
    }
}

class WordFinder{
    private ArrayList<String> privateList = new ArrayList<String>();
    void buildWords(String string){
        String[] strings = string.split("\\b|[^_a-z0-9]");
        int length = strings.length;
        for(int i = 0; i<length; i++){
            privateList.add(strings[i]);
        }
    }

    void printOccurrence(String string){
        int count = 0, len = privateList.size();
        for(int i = 0; i < len; i++){
            if(string.equals(privateList.get(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}

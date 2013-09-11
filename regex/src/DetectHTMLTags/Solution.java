package DetectHTMLTags;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/11/13
 * Time: 9:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        DetectHTMLTags detectHTMLTags = new DetectHTMLTags();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while (0 < N--){
            detectHTMLTags.buildTags(scanner.nextLine());
        }
        detectHTMLTags.printNumberOfTags();
    }
}

class DetectHTMLTags{
    private boolean debugMode = false;
    private TreeSet<String> tagSet = new TreeSet<String>();
    void buildTags(String htmlString){
        String[] strings = htmlString.replaceAll(">[^>]*<","><").replaceAll("</[^>]*>","").split("<\\s*");
        int len = strings.length;
        String key = "";
        for(int i = 0; i < len; i++){
            key = strings[i].trim().split("\\s|>")[0];
            if(!"".equals(key))tagSet.add(key);
            if(debugMode){
                System.out.println("key is \""+key+"\"");
                System.out.println(tagSet.size());
            }
        }
        if(debugMode){
            System.out.println(htmlString);
            for(int i = 0; i < len; i++){
                System.out.println(strings[i]);
            }
        }
    }
    void printNumberOfTags(){
        Iterator<String> itr = tagSet.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+((itr.hasNext())?";":""));
        }
    }
}

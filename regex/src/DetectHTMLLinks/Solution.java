package DetectHTMLLinks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/11/13
 * Time: 10:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        HTMLLinkIdentifier htmlLinkIdentifier = new HTMLLinkIdentifier();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while (0 < N--){
            htmlLinkIdentifier.buildLinks(scanner.nextLine());
        }
        htmlLinkIdentifier.printLinks();
    }
}

class HTMLLinkIdentifier{
    private boolean debugMode = true;
    private ArrayList<String> linksList = new ArrayList<String>();
    void buildLinks(String htmlString){
        if(!htmlString.matches(".*<\\s*a\\s+href=\".*"))return;
        String[] strings = htmlString.split("<\\s*a\\s+href=\"");
        int len = strings.length;
        for (int i = 1; i < len; i++){
            linksList.add(strings[i].replaceAll("<\\s*/.*","").replaceAll("<[^<]*>","").replaceAll("\"[^<]*>\\s*",","));
        }
    }
    void printLinks(){
        int len = linksList.size();
        for(int i = 0; i < len; i++){
            System.out.println(linksList.get(i));
        }
    }
}
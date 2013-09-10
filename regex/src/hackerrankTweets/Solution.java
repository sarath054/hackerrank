package hackerrankTweets;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/10/13
 * Time: 10:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        FindTweets findTweets = new FindTweets();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine()), count = 0;
        while(0 < N--){
            if(findTweets.hasWordHackerrank(scanner.nextLine().toString()))
                count+=1;
        }
        System.out.println(count);
    }
}

class FindTweets{
    boolean hasWordHackerrank(String string){
        return string.toLowerCase().matches("(.*)hackerrank(.*)");
    }
}

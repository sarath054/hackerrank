package lonelyInteger;

import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedSet;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/13/13
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        FindLonely findLonely = new FindLonely();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] inputIntegers = new int[N];
        for(int i=0; i<N; i++){
            findLonely.postInteger(scanner.nextInt());
        }
        findLonely.printLonely();
    }
}

class FindLonely{
    private HashSet<Integer> localSet = new HashSet<Integer>();
    void postInteger(int someInt){
        if(localSet.contains(someInt)){
            localSet.remove(someInt);
        } else {
            localSet.add(someInt);
        }
    }
    void printLonely(){
        System.out.println(localSet.toArray()[0]);
    }
}

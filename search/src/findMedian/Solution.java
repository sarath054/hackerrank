package findMedian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 12/29/13
 * Time: 7:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> inputs = new ArrayList<Integer>(n);
        for(int i=0; i<n; i++){
            inputs.add(sc.nextInt());
        }
        Collections.sort(inputs);
        System.out.println(inputs.get(n/2));
    }
}
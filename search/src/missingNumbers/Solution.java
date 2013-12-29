package missingNumbers;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 12/29/13
 * Time: 8:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    private static LinkedHashMap<Integer, Integer> store = new LinkedHashMap<Integer, Integer>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key, value;
        while(0<n--){
            key = sc.nextInt();
            if(store.containsKey(key)){
                value = store.get(key);
            } else {
                value = 0;
            }
            store.put(key, --value);
        }
        n = sc.nextInt();
        while (0<n--){
            key = sc.nextInt();
            if(store.containsKey(key)){
                value = store.get(key);
            } else {
                value = 0;
            }
            store.put(key, ++value);
        }
        Iterator<Integer> itr = store.keySet().iterator();
        while(itr.hasNext()){
            key = itr.next();
            value = store.get(key);
            if(value>0){
                System.out.print(key+" ");
            }
        }

    }
}

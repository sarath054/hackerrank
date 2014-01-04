package buildingAList;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 12/30/13
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        CombinationBuilder cB;
        while (0 < T--) {
            sc.nextLine();
            cB = new CombinationBuilder(sc.nextLine().trim());
//            Date dt = new Date();
            cB.buildAllCombinations();
            cB.printSortedCombinations();
//            System.out.println(new Date().getTime() - dt.getTime());
        }
    }
}

class CombinationBuilder {
    private String originalString;
    private ArrayList<String> combinations;
    private TreeSet<String> sortedCombinations = new TreeSet<String>();

    CombinationBuilder(String input) {
        originalString = input;
        combinations = new ArrayList<String>();
    }

    void buildAllCombinations(){
        int len = originalString.length();
        for (int i=len-1; i>=0; i--){
            buildCombinations(originalString.charAt(i));
        }
    }

    private void buildCombinations(char chr) {
        int prevSize = combinations.size();
        if (prevSize == 0) {
            combinations.add("" + chr);
        } else {
            String[] tempArr = new String[prevSize + 1];
            for (int i = 0; i < prevSize; i++) {
                tempArr[i] = chr + combinations.get(i);
            }
            tempArr[prevSize] = "" + chr;
            combinations.addAll(Arrays.asList(tempArr));
        }
    }

    private void sortCombinations(){
        sortedCombinations.addAll(combinations);
    }

    void printSortedCombinations(){
        sortCombinations();
        Iterator<String> itr = sortedCombinations.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

package FindPoint;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 10/10/13
 * Time: 10:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scanner.nextLine().trim());
        while (0 < noOfTestCases--){
            new FindPoint(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()).printPoint();
        }
    }
}

class FindPoint{
    private int xCor = 0;
    private int yCor = 0;
    public FindPoint(int a, int b, int x, int y){
        xCor = 2*x - a;
        yCor = 2*y - b;
    }

    public void printPoint(){
        System.out.println(xCor+" "+yCor);
    }
}

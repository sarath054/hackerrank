package DetectHTMLAttribs;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/11/13
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args) {
        AttributeFinder attributeFinder = new AttributeFinder();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while (0 < N--) {
            attributeFinder.buildAttributes(scanner.nextLine());
        }
        attributeFinder.printAttributes();
    }
}

class AttributeFinder {
    private TreeMap<String, TreeSet<String>> attributes = new TreeMap<String, TreeSet<String>>();
    private boolean debugMode = true;

    void buildAttributes(String htmlString) {
        htmlString = htmlString.replaceAll("[^>]*<", "<").replaceAll("\\s*<\\s*/[^>]*>", " ").replaceAll("=(\"|')[^\"]*(\"|')", "").replaceAll(">|/", "");
        String[] strings = htmlString.split("<");
        int len = strings.length;
        for (int i = 0; i < len; i++) {
            setKeyAndValues(strings[i]);
        }
    }

    private void setKeyAndValues(String tags) {
        if ("".equals(tags.trim())) return;
        String[] tempSplit = tags.trim().split(" ", 2);
        TreeSet<String> treeSet = getValueOfKey(tempSplit[0].trim());
        if (treeSet == null || tempSplit.length < 2) return;
        treeSet.addAll(Arrays.asList(tempSplit[1].trim().split(" ")));
    }

    private TreeSet<String> getValueOfKey(String key) {
        if (!"".equals(key) && !attributes.containsKey(key)) {
            attributes.put(key, new TreeSet<String>());
        }
        return attributes.get(key);
    }

    void printAttributes() {
        Iterator<String> keyItr = attributes.keySet().iterator(), valItr;
        String key = "";
        while (keyItr.hasNext()) {
            key = keyItr.next();
            System.out.print(key + ":");
            if (attributes.get(key) != null) {
                valItr = attributes.get(key).iterator();
                while (valItr.hasNext()) {
                    System.out.print(valItr.next() + ((valItr.hasNext()) ? "," : ""));
                }
                System.out.print("\n");
            } else {
                System.out.print("\n");
            }
        }
    }
}

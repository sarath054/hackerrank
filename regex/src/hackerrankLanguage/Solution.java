package hackerrankLanguage;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sarath
 * Date: 9/10/13
 * Time: 5:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public static void main(String[] args){
        LangAPIValidator langAPIValidator = new LangAPIValidator();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while (0 < N--){
            langAPIValidator.validateAPI(scanner.nextLine());
        }
    }
}

class LangAPIValidator{
    private String validLangStrings = "C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|" +
            "BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC";

    void validateAPI(String string){
        boolean valid = string.matches("[1-9][0-9]{3,4}\\s+("+validLangStrings+")");
        System.out.println((valid)?"VALID":"INVALID");
    }
}
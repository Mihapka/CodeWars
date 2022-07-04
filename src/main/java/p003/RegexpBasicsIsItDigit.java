package p003;

import java.util.regex.Pattern;

public class RegexpBasicsIsItDigit {
    /*Implement String#digit? (in Java StringUtils.isDigit(String)), which should return true if
    given object is a digit (0-9), false otherwise.*/
    public static void main(String[] args) {
        System.out.println(isDigit(""));
        System.out.println(isDigit(" "));
        System.out.println(isDigit("t9"));
        System.out.println(isDigit("q"));
        System.out.println(isDigit("23424249"));
    }

    public static boolean isDigit(String s) {
        return Pattern.matches("[0-9]+", s);
//        на codewars тестирование проходит только с regex "[0-9]" (без '+')
//        return s.matches("[0-9]");
//        return s.matches("\\d");
    }
}

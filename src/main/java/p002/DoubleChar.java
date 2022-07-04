package p002;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DoubleChar {
    /*Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
    Examples (Input -> Output):
    * "String"      -> "SSttrriinngg"
    * "Hello World" -> "HHeelllloo  WWoorrlldd"
    * "1234!_ "     -> "11223344!!__  "
    Good Luck!*/
    public static void main(String[] args) {
        System.out.println(doubleChar("123456"));
    }

    public static String doubleChar(String s) {
        return Arrays.stream(s.split("")).map(w -> w + w).collect(Collectors.joining());
    }
}

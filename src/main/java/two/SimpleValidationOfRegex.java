package two;

import java.util.regex.Pattern;

public class SimpleValidationOfRegex {
    /*Write a simple regex to validate a username. Allowed characters are:
        lowercase letters,  numbers,    underscore
        Length should be between 4 and 16 characters (both included).*/
    public static void main(String[] args) {
        String a = "3222222222";
        System.out.println(validateUsr(a));
    }

    public static boolean validateUsr(String s) {
        return Pattern.matches("[a-z_0-9]{4,10}", s);
//        return s.matches("[a-z_\\d]{4,16}");
    }
}

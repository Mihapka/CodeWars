package p002;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringTemplatesBugFixing5 {
    /*Oh no! Timmy hasn't followed instructions very carefully and forgot how to use the new
    String Template feature, Help Timmy with his string template so it works as he expects!*/
    public static void main(String[] args) {
        System.out.println(buildString("Cheese", "Milk", "Chocolate"));
        System.out.println(buildString("Cheese", "Milk"));
        System.out.println(buildString("Chocolate"));
    }

    public static String buildString(String... args) {
        String str = Arrays.stream(args).collect(Collectors.toList()).toString();
        String str1 = String.format("I like %s!", str.substring(1, str.length()-1));
        return str1;
//        return "I like " + String.join(", ", args) + "!";
    }
}

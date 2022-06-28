package two;

public class FakeBinary {
    /*Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and
    above with '1'. Return the resulting string.
    Note: input will never be an empty string*/
    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
        System.out.println("01011110001100111");
    }

    public static String fakeBin(String numberString) {
        String str = numberString.replaceAll("[0-4]", "0");
        return str.replaceAll("[5-9]", "1");
//        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}

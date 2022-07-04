package p003;

public class HexToDecimal {
    /*Complete the function which converts hex number (given as a string) to a decimal number.*/
    public static void main(String[] args) {
        System.out.println(hexToDec("-C"));
    }

    public static int hexToDec(final String hexString) {

        return Integer.parseInt(hexString, 16);
    }
}

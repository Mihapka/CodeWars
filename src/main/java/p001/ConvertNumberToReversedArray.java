package p001;

import java.util.Arrays;

public class ConvertNumberToReversedArray {
    /*  Convert number to reversed array of digits
        Given a random non-negative number, you have to return the digits of this number within an array in
        reverse order.
        Example:
        348597 => [7,9,5,8,4,3]     0 => [0]*/

    public static void main(String[] args) {
        int i = 348597;
        int[] array = new StringBuilder().append(i).reverse().chars().map(Character::getNumericValue).toArray();
        Arrays.stream(array).forEach(System.out::println);
    }
}

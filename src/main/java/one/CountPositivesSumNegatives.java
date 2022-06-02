package one;

import java.util.Arrays;

public class CountPositivesSumNegatives {
    /*Given an array of integers. Return an array, where the first element is the count of
    positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
    If the input is an empty array or is null, return an empty array.
    Example
    For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].*/

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, -11, -12, -13, -14, -15};
//        int[] array = new int[0];
        Arrays.stream(result(array)).forEach(System.out::println);
    }

    public static int[] result(int[] array) {
        int[] result = new int[2];

        if (array == null || array.length == 0) {
            System.out.println("Array is null or empty");
            return new int[0];
        }

        for (Integer i : array) {
            if (i > 0) {
                result[0]++;
            } else {
                result[1] += i;
            }
        }
        return result;
    }
}

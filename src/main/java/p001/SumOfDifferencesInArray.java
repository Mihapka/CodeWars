package p001;

import java.util.Arrays;
import java.util.Collections;

public class SumOfDifferencesInArray {
    /*  Your task is to sum the differences between consecutive pairs in the array in descending order.
        For example:    [2, 1, 10]  ->  9
        In descending order: [10, 2, 1]
        Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
        If the array is empty or the array has only one element the result should be 0 ( Nothing in Haskell ).*/
    public static void main(String[] args) {
        int[] nums = new int[]{2, 40, 50, 60, 99, 222};
        System.out.println(sumOfDifferences(nums));
    }

    public static int sumOfDifferences(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        int num = 0;
        Integer[] integers = Arrays.stream(arr).boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);
        for (int i = 1; i < integers.length; i++) {
            num = num + integers[i - 1] - integers[i];
        }
        return num;
    }

//    Best Practices:
//    public static int sumOfDifferences(int[] arr) {
//        Arrays.sort(arr);
//        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
//    }
}
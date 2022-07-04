package p003;

import java.util.Arrays;

public class SumOfPositive {
    /*You get an array of numbers, return the sum of all of the positives ones.
    Example [1,-4,7,12] => 1 + 7 + 12 = 20
    Note: if there is nothing to sum, the sum is default to 0.*/
    public static void main(String[] args) {
        System.out.println("13    " + sum(new int[]{1, -2, 3, 4, 5}));
        System.out.println("0     " + sum(new int[]{-1, -2, -3, -4, -5}));
    }

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(i -> i > 0).sum();
    }
}

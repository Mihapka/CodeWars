package p003;

import java.util.Arrays;

public class EnumerableMagic25TakeFirstNElements {
    /*Create a function that accepts a list/array and a number n, and returns a list/array of
    the first n elements from the list/array.
    If you need help, here's a reference:*/
    public static void main(String[] args) {
        System.out.println("{0, 1, 2}   " + Arrays.toString(take(new int[]{0, 1, 2}, 3)));
    }

    public static int[] take(int[] arr, int n) {
        return Arrays.stream(arr).limit(n).toArray();
//        return n > arr.length ? arr : Arrays.copyOf(arr, n);
    }
}

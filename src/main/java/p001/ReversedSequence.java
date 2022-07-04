package p001;

import java.util.Arrays;

public class ReversedSequence {
    /*Build a function that returns an array of integers from n to 1 where n>0.
    Example : n=5 --> [5,4,3,2,1]*/
    public static void main(String[] args) {
        System.out.println("length is: " + reverse(5).length);
        Arrays.stream(reverse(5)).forEach(System.out::print);
    }

    public static int[] reverse(int n) {
        int length = n;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = n-i;
        }
        return array;
    }
}

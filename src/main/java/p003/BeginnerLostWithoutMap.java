package p003;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class BeginnerLostWithoutMap {
    /*Given an array of integers, return a new array with each value doubled.
    For example:
    [1, 2, 3] --> [2, 4, 6]*/
    public static void main(String[] args) {
        System.out.println("2, 4, 6" + "\n" + Arrays.toString(map(new int[]{1, 2, 3})));
        System.out.println("8, 2, 2, 2, 8" + "\n" + Arrays.toString(map(new int[]{4, 1, 1, 1, 4})));
    }

    public static int[] map(int[] arr) {

        return stream(arr).map(x -> x * 2).toArray();
//        return IntStream.of(arr).map(i -> i*2).toArray();
//        return Arrays.stream(arr).map(x -> x*2).toArray();
    }
}

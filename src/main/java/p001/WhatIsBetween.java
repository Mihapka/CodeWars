package p001;

import java.util.stream.IntStream;

public class WhatIsBetween {
    /*Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.
    For example: a = 1, b = 4    --> [1, 2, 3, 4]*/
    public static void main(String[] args) {
        between(0, 4);
    }

    public static int[] between(int a, int b) {
        int[] result = IntStream.range(a, b + 1).toArray();
//        Arrays.stream(result).forEach(System.out::print);
        return result;
//        Best Practices
//        return rangeClosed(a, b).toArray();
    }
}

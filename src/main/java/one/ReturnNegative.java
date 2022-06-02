package one;

public class ReturnNegative {
    /*  In this simple assignment you are given a number and have to make it negative.
        But maybe the number is already negative?
        Examples
        Kata.makeNegative(1);  // return -1
        Kata.makeNegative(-5); // return -5
        Kata.makeNegative(0);  // return 0
        Notes
        The number can be negative already, in which case no change is required.
        Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.*/

    public static void main(String[] args) {
        System.out.println(makeNegative(-10));
        System.out.println(makeNegative(0));
        System.out.println(makeNegative(10));
    }

    public static int makeNegative(final int x) {
        // Your code here.
        return x <= 0 ? x : x * -1;
    }
}

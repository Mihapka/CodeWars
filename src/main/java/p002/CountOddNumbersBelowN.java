package p002;

import java.util.stream.IntStream;

public class CountOddNumbersBelowN {
    /*Given a number n, return the number of positive odd numbers below n, EASY!
    Examples (Input -> Output)
    7  -> 3 (because odd numbers below 7 are [1, 3, 5])
    15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
    Expect large Inputs!*/
    public static void main(String[] args) {
        int num = 15;
        System.out.println(oddCount(num));
    }

    public static int oddCount(int n) {
        return  (int) IntStream.range(1, n).filter(o -> o % 2 != 0).count();
//        return n/2;
    }
}

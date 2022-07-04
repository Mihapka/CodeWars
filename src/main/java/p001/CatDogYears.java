package p001;

import java.util.Arrays;

public class CatDogYears {
    /*Return their respective ages now as [humanYears,catYears,dogYears]
    NOTES:
    humanYears >= 1
    humanYears are whole numbers only
    Cat Years
    15 cat years for first year
    +9 cat years for second year
    +4 cat years for each year after that
    Dog Years
    15 dog years for first year
    +9 dog years for second year
    +5 dog years for each year after that*/
    public static void main(String[] args) {
        Arrays.stream(humanYearsCatYearsDogYears(10)).forEach(System.out::print);
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] arr = {humanYears, 0, 0};
        switch (humanYears) {
            case 1:
                arr[1] = 15;
                arr[2] = 15;
                break;
            case 2:
                arr[1] = 24;
                arr[2] = 24;
                break;
            default:
                arr[1] = 24 + Math.abs(humanYears - 2) * 4;
                arr[2] = 24 + Math.abs(humanYears - 2) * 5;
        }
        return arr;
    }
}

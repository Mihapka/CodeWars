package p003;

public class IsItEven {
    /*In this Kata we are passing a number (n) into a function.
    Your code will determine if the number passed is even (or not).
    The function needs to return either a true or false.
    Numbers may be positive or negative, integers or floats.
    Floats with decimal part non equal to zero are considered UNeven for this kata.*/
    public static void main(String[] args) {
        System.out.println(isEven(10.4));
    }

    public static boolean isEven(double n) {
        return n % 2 == 0;
    }
}

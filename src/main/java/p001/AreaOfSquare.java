package p001;

public class AreaOfSquare {
    /*Complete the function that calculates the area of the red square, when the length of
    the circular arc A is given as the input. Return the result rounded to two decimals.
     */
    public static void main(String[] args) {

        System.out.println(squareArea(0));
    }

    public static double squareArea(double A) {
        double radius = (4 * A) / (2 * Math.PI);
        return Math.round((Math.pow(radius, 2)) * Math.pow(10, 2)) / Math.pow(10, 2);
//        return new BigDecimal(Math.pow((A * 2 / Math.PI), 2))
//                .setScale(2, RoundingMode.DOWN)
//                .doubleValue();
    }
}

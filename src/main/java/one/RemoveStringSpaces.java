package one;

public class RemoveStringSpaces {
    /*Simple, remove the spaces from the string, then return the resultant string.*/
    public static void main(String[] args) {
        System.out.println(noSpace(" qw  er    ty yu u u    y"));
    }
    static String noSpace(final String x) {
        return x.replace(" ", "");
    }
}

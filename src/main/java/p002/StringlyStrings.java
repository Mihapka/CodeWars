package p002;

public class StringlyStrings {
    /*write me a function stringy that takes a size and returns a string of alternating '1s' and '0s'.
        the string should start with a 1.
        a string with size 6 should return :'101010'.
        with size 4 should return : '1010'.
        with size 12 should return : '101010101010'.
        The size will always be positive and will only use whole numbers.*/
    public static void main(String[] args) {
        System.out.println("101010101010");
        System.out.println(stringy(12));
    }

    public static String stringy(int size) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < size +1; i++) {
            str.append(i%2);
        }
        return String.valueOf(str);
    }
}

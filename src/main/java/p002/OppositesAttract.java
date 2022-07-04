package p002;

public class OppositesAttract {
    public static void main(String[] args) {
        System.out.println(isLove(0, 1));
    }

    public static boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 == 0 && flower2 % 2 != 0 || (flower1 % 2 != 0 && flower2 % 2 == 0);
//        return flower1 % 2 != flower2 % 2;
    }
}

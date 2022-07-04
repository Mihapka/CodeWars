package p003;

public class IfYouCantSleep {
    /*If you can't sleep, just count sheep!!
    Task:
    Given a non-negative integer, 3 for example, return a string with a murmur:
    "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.*/
    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }

    public static String countingSheep(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            stringBuilder.append(String.format("%s sheep...", i));
        }
        return stringBuilder.toString();
    }

//    public static String countingSheep(int num) {
//        return IntStream.rangeClosed(1, num)
//                .mapToObj(i -> i + " sheep...")
//                .collect(Collectors.joining());
//    }
}


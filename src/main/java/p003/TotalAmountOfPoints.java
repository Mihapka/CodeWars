package p003;

public class TotalAmountOfPoints {
    /*Our football team finished the championship. The result of each match look like "x:y".
    Results of all matches are recorded in the collection.
    For example: ["3:1", "2:2", "0:1", ...]
    Write a function that takes such collection and counts the points of our team in the
    championship. Rules for counting points for each match:
    if x > y: 3 points
    if x < y: 0 point
    if x = y: 1 point
    Notes:
    there are 10 matches in the championship
    0 <= x <= 4
    0 <= y <= 4*/
    public static void main(String[] args) {
        System.out.println(points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));
    }

    public static int points(String[] games) {
        int count = 0;
        for (int i = 0; i < games.length; i++) {
            count += games[i].charAt(0) > games[i].charAt(2) ? +3
                    : (games[i].charAt(0) < games[i].charAt(2) ? +0
                    : +1);
        }
        return count;
//        return Arrays.stream(games)
//                .mapToInt(score -> score.charAt(0) - score.charAt(2))
//                .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
//                .sum();
    }
}

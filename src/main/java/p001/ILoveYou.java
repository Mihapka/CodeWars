package p001;

import java.util.ArrayList;
import java.util.List;

public class ILoveYou {
    /*Who remembers back to their time in the schoolyard, when girls would take a flower and
    tear its petals, saying each of the following phrases each time a petal was torn:
    I love you, a little, a lot, passionately, madly, not at all
    When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.
    Your goal in this kata is to determine which phrase the girls would say for a flower of a
    given number of petals, where nb_petals > 0.*/
    public static void main(String[] args) {
        int nb_petals = 516;
        System.out.println(howMuchILoveYou(nb_petals));
    }

    public static String howMuchILoveYou(int nb_petals) {
        List<String> predictions = new ArrayList<>();
        predictions.add("I love you");
        predictions.add("a little");
        predictions.add("a lot");
        predictions.add("passionately");
        predictions.add("madly");
        predictions.add("not at all");

        if (nb_petals % 6 == 0) {
            return predictions.get(6 - 1);
        }
        return nb_petals <= 6 ?
                predictions.get(nb_petals - 1) :
                predictions.get(nb_petals % (predictions.size()) - 1);
    }
}

package two;

public class RockPaperScissors {

    public static void main(String[] args) {

        String answer1 = "rock";
        String answer2 = "paper";
        String answer3 = "scissors";

        Answer a1 = answerFabric(answer3);
        Answer a2 = answerFabric(answer3);

        System.out.println(a1.compareTo(a2) > 0 ? "Player 1 won!" : (a1.compareTo(a2) < 0 ? "Player 2 won!" : "Draw!"));
//        return a1.equals(a2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(a1+a2)?1:2) + " won!";

    }

    static Answer answerFabric(String str) {
        if ("rock".equals(str)) return new Rock();
        if ("paper".equals(str)) return new Paper();
        if ("scissors".equals(str)) return new Scissors();
        else throw new IllegalArgumentException();
    }

    interface Answer extends Comparable<Answer> {

    }

    static final class Rock implements Answer {

        @Override
        public int compareTo(Answer o) {
            if (o instanceof Paper) return -1;
            if (o instanceof Scissors) return 1;
            if (o instanceof Rock) return 0;
            else throw new IllegalArgumentException();
        }
    }

    static final class Paper implements Answer {

        @Override
        public int compareTo(Answer o) {
            if (o instanceof Paper) return 0;
            if (o instanceof Scissors) return -1;
            if (o instanceof Rock) return 1;
            else throw new IllegalArgumentException();
        }
    }

    static final class Scissors implements Answer {

        @Override
        public int compareTo(Answer o) {
            if (o instanceof Paper) return 1;
            if (o instanceof Scissors) return 0;
            if (o instanceof Rock) return -1;
            else throw new IllegalArgumentException();
        }
    }
}



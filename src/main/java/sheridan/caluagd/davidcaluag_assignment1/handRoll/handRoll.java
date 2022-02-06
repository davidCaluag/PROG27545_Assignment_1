//David Caluag, Sheridan,Ontario

package sheridan.caluagd.davidcaluag_assignment1.handRoll;

public class handRoll {

    private final static String[] _hand
            = {"Rock", "Paper", "Scissors"};

    final private String personHand;
    final private String computerHand;

    public handRoll() {
        int personRand = (int) (2 * Math.random());
        int computerRand = (int) (2 * Math.random());
        personHand = _hand[personRand];
        computerHand = _hand[computerRand];
    }

    public String getComputer() {
        return computerHand;
    }

    public String getUser() {
        return computerHand;
    }
}

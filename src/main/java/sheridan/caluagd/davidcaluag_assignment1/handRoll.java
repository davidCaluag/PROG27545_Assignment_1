package sheridan.caluagd.davidcaluag_assignment1;

public class handRoll {

    private final static String[] _hand
            = {"Rock", "Paper", "Scissors"};

    public int RandHand(){
        int rand = (int) (2 * Math.random());
        rand += 1;
        return rand;
    }

    public int getHand() {
        return RandHand();
    }
}

//David Caluag, Sheridan,Ontario

package sheridan.caluagd.davidcaluag_assignment1.handRoll;

import java.io.Serializable;
import java.util.Objects;

public class HandRoll implements Serializable {

    private final static String[] _hand
            = {"Rock", "Paper", "Scissors"};


    private String personHand="Scissors";
    private String computerHand="Scissors";
    private String _answer = getAnswer();
    private int _message=0;

    public HandRoll() {
    };

    public int getMessage(){
        return _message;
    }

    public void setMessage(int message){this._message = message;}

    public String getComputer() {
        setComputer();
        return computerHand;
    }

    public void setComputer() {
        int computerRand = (int) (2 * Math.random());
        this.computerHand = _hand[computerRand];
    }

    public String getPerson() {
        return personHand;
    }

    public void setPerson(String userHand) {
        this.personHand = _hand[_message];
    }

    public void setAnswer() {
        _answer = findAnswer(personHand, computerHand);
    }

    public String getAnswer() {
        return findAnswer(personHand, computerHand);

    }

    public String findAnswer(String answer, String compare) {
        String returnAnswer = null;
        if (!Objects.equals(answer, compare)) {
            switch (answer) {
                case "Rock":
                    returnAnswer = Objects.equals(compare, "Paper") ? "Lost" : "Won";
                    break;
                case "Scissors":
                    returnAnswer = Objects.equals(compare, "Rock") ? "Lost" : "Won";
                    break;
                case "Paper":
                    returnAnswer = Objects.equals(compare, "Scissors") ? "Lost" : "Won";
                    break;
            }
        } else {
            returnAnswer = "tied";
        }
        return returnAnswer;
    }

    @Override
    public String toString() {
        return "HandRoll{" +
                "personHand=" + personHand +
                ",computerHand=" + computerHand +
                ",_answer=" + _answer+
                ",_message="+_message+
                '}';
    }
}


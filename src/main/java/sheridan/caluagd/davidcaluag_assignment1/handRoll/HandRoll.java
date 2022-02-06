//David Caluag, Sheridan,Ontario

package sheridan.caluagd.davidcaluag_assignment1.handRoll;

import java.util.Objects;

public class HandRoll {

    private final static String[] _hand
            = {"Rock", "Paper", "Scissors"};

    public String personHand;
    public String computerHand;
    public String _answer;
    public String _message;

    public HandRoll() {
    }

    public String getComputer() {
        int computerRand = (int) (2 * Math.random());
        this.computerHand = _hand[computerRand];
        return computerHand;
    }

    public String getPerson() {
        return personHand;
    }

    public void setPerson(String userHand) {this.personHand = userHand;};


    public void setAnswer(){
        _answer = findAnswer(personHand,computerHand);
    }

    public String getAnswer() {
        _answer = findAnswer(personHand,computerHand);
        return _answer;
    }

    public String findAnswer(String answer, String compare){
        String returnAnswer = null;
        if(!Objects.equals(answer, compare)){
            switch(answer){
                case "Rock":
                    returnAnswer = Objects.equals(compare, "Paper")? "Lost" : "Won";
                    break;
                case "Scissors":
                    returnAnswer = Objects.equals(compare, "Rock")? "Lost" : "Won";
                    break;
                case "Paper":
                    returnAnswer = Objects.equals(compare, "Scissors")? "Lost" : "Won";
                    break;
            }
        }
        else{
            returnAnswer = "tied";
        };
    return returnAnswer;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "message=" + message +
                ", registered=" + registered +
                '}';
    }
    }


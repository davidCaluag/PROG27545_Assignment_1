//David Caluag, Sheridan,Ontario

package sheridan.caluagd.davidcaluag_assignment1.handRoll;

public class HandRoll {

    private final static String[] _hand
            = {"Rock", "Paper", "Scissors"};

    final private String personHand;
    final private String computerHand;
    final private String _answer;

    public HandRoll() {
        int personRand = (int) (2 * Math.random());
        int computerRand = (int) (2 * Math.random());
        personHand = _hand[personRand];
        computerHand = _hand[computerRand];
        _answer = findAnswer(personHand,computerHand);

    }

    public String getComputer() {
        return computerHand;
    }

    public String getUser() {
        return personHand;
    }

    public String findAnswer(String answer, String compare){
        String returnAnswer="N/A";
        if(answer!=compare){
            switch(answer){
                case "Rock":
                    if(compare=="Scissors")
                        returnAnswer = "Lost";
                    else{
                        returnAnswer = "Won";
                    }
                    break;
                case "Scissors":
                    if(compare=="Rock")
                        returnAnswer = "Lost";
                    else{
                        returnAnswer = "Won";
                    }
                        break;
                case "Paper":
                    if(compare=="Scissors"){
                        returnAnswer = "Lost";
                    }
                    else{
                        returnAnswer = "Won";
                    }
                    break;
            }
        }
        else{
            returnAnswer = "Tied";
        };

        return returnAnswer;

    }
    }


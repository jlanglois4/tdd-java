package edu.wctc.Yahtzee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {

    private final List<Die> hand = new ArrayList<>();

    private final String[] returnString = {
            "Yahtzee",
            "Four of a Kind",
            "Three of a Kind",
            "Full House",
            "Two Pair",
            "One Pair",
            "Large Straight"
    };


    public Hand(Die die1, Die die2, Die die3, Die die4, Die die5) {
        hand.add(die1);
        hand.add(die2);
        hand.add(die3);
        hand.add(die4);
        hand.add(die5);
    }

    private List<Integer> getDieNum() {
        List<Integer> dieNums = new ArrayList<>();

        for (Die die : hand) {
            dieNums.add(die.getDieNum());
        }
        return dieNums;
    }

    private List<Integer> getMatches() {
        List<Integer> matches = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            matches.add(Collections.frequency(getDieNum(), i));
        }
        return matches;
    }

    private Integer getMatches(int totalDiceMatchesNeeded) {
        int count = 0;
        for (Integer i : getMatches()) {
            if (i == totalDiceMatchesNeeded) {
                count++;
            }
        }
        return count;
    }

    public String fiveOfAKind() {
        int totalDiceMatchesNeeded = 5;
        if (getMatches(totalDiceMatchesNeeded) == 1) {
            return returnString[0];
        } else {
            return "";
        }
    }

    public String fourOfAKind() {
        int totalDiceMatchesNeeded = 4;
        if (getMatches(totalDiceMatchesNeeded) == 1) {
            return returnString[1];
        } else {
            return "";
        }
    }

    public String threeOfAKind() {
        int totalDiceMatchesNeeded = 3;
        if (getMatches(totalDiceMatchesNeeded) == 1) {
            return returnString[2];
        } else {
            return "";
        }
    }

    public String fullHouse() {
        int firstDiceMatchNeeded = 2;
        int secondDiceMatchNeeded = 3;
        if (getMatches(firstDiceMatchNeeded) == 1 && getMatches(secondDiceMatchNeeded) == 1) {
            return returnString[3];
        } else {
            return "";
        }
    }

    public String twoPair() {
        int firstDiceMatchNeeded = 2;
        int secondDiceMatchNeeded = 3;
        if (getMatches(firstDiceMatchNeeded) == 2 || getMatches(secondDiceMatchNeeded) == 1) {
            return returnString[4];
        } else {
            return "";
        }
    }

    public String onePair() {
        int totalDiceMatchesNeeded = 2;
        if (getMatches(totalDiceMatchesNeeded) == 1) {
            return returnString[5];
        } else {
            return "";
        }
    }

    public String oneOfAKind() {
        int totalDiceMatchesNeeded = 2;
        if (getMatches(totalDiceMatchesNeeded) == 0) {
            return returnString[6];
        } else {
            return "";
        }
    }


}

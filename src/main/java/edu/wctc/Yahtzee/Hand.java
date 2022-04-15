package edu.wctc.Yahtzee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {

    private final List<Die> hand = new ArrayList<>();
    private boolean OneOfAKind = true;
    private int diceMatchNeeded = 0;
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

    private List<Integer> getDieNumList() {
        List<Integer> dieNums = new ArrayList<>();
        for (Die die : hand) {
            dieNums.add(die.getDieNum());
        }
        return dieNums;
    }

    private List<Integer> getDiceNumTotals() {
        List<Integer> matches = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            matches.add(Collections.frequency(getDieNumList(), i));
        }
        return matches;
    }

    private Integer getMatches(int totalDiceMatchesNeeded) {
        int totalMatches = 0;
        for (Integer diceNum : getDiceNumTotals()) {
            if (diceNum == totalDiceMatchesNeeded) {
                totalMatches++;
            }
        }
        return totalMatches;
    }

    public String fiveOfAKind() {
        if (getMatches(diceMatchNeeded = 5) == 1) {
            OneOfAKind = false;
            return returnString[0];
        } else {
            return "";
        }
    }

    public String fourOfAKind() {
        if (getMatches(diceMatchNeeded = 4) == 1) {
            OneOfAKind = false;
            return returnString[1];
        } else {
            return "";
        }
    }

    public String threeOfAKind() {
        if (getMatches(diceMatchNeeded = 3) == 1) {
            OneOfAKind = false;
            return returnString[2];
        } else {
            return "";
        }
    }

    public String fullHouse() {
        if (getMatches(diceMatchNeeded = 2) == 1 && getMatches(diceMatchNeeded = 3) == 1) {
            OneOfAKind = false;
            return returnString[3];
        } else {
            return "";
        }
    }

    public String twoPair() {
        if (getMatches(diceMatchNeeded = 2) == 2 || getMatches(diceMatchNeeded = 3) == 1) {
            OneOfAKind = false;
            return returnString[4];
        } else {
            return "";
        }
    }

    public String onePair() {
        if (getMatches(diceMatchNeeded = 2) == 1) {
            OneOfAKind = false;
            return returnString[5];
        } else {
            return "";
        }
    }

    public String oneOfAKind() {
        if (getMatches(diceMatchNeeded = 1) == 5) {
            return returnString[6];
        } else {
            return "";
        }
    }


}

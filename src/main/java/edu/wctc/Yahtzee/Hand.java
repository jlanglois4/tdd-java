package edu.wctc.Yahtzee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {

    private List<Die> hand = new ArrayList<>();

    private String[] returnString = {
            "Yahtzee",
            "Large Straight",
            "Small Straight",
            "Full House",
            "Two Pair",
            "One Pair",
            "One of a Kind"
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

    private Integer getCount(int totalDiceMatchesNeeded) {
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
        if (getCount(totalDiceMatchesNeeded) == 1) {
            return returnString[0];
        } else {
            return "";
        }
    }

    public String fourOfAKind() {
        int totalDiceMatchesNeeded = 4;
        if (getCount(totalDiceMatchesNeeded) == 1) {
            return returnString[1];
        } else {
            return "";
        }
    }

    public String threeOfAKind() {
        int totalDiceMatchesNeeded = 3;
        if (getCount(totalDiceMatchesNeeded) == 1) {
            return returnString[2];
        } else {
            return "";
        }
    }

    public String fullHouse() {
        int totalDiceMatchesNeeded = 2;
        if (getCount(totalDiceMatchesNeeded) == 1) {
            return returnString[3];
        } else {
            return "";
        }
    }

    public String twoPair() {
        int totalDiceMatchesNeeded = 1;
        if (getCount(totalDiceMatchesNeeded) == 1) {
            return returnString[4];
        } else {
            return "";
        }
    }

    public String onePair() {
        var integers = getMatches();
        integers.removeIf(i -> i == 0);
        if (integers.size() == 4) {
            return returnString[5];
        } else {
            return "";
        }
    }

    public String oneOfAKind() {
        var integers = getMatches();
        integers.removeIf(i -> i == 0);
        if (integers.size() == 5) {
            return returnString[6];
        } else {
            return "";
        }
    }


}

package edu.wctc.Yahtzee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {

    private List<Die> hand = new ArrayList<>();

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

   /* private boolean fullHouseOrFourOfAKind() {
        return ((dieNumFrequencies().get(0) == 2 || dieNumFrequencies().get(0) == 3) && (dieNumFrequencies().get(1) == 2 || dieNumFrequencies().get(1) == 3));
    }

    private List<Integer> diceValues() {
        return getDieNum().stream().distinct().collect(Collectors.toList());
    }

    private List<Integer> dieNumFrequencies() {
        var integers = getMatches().stream().distinct().collect(Collectors.toList());
        integers.removeIf(i -> i == 0);
        return integers;
    }*/

    private List<Integer> getMatches() {
        List<Integer> matches = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            matches.add(Collections.frequency(getDieNum(), i));
        }
        return matches;
    }

    private Integer getCount(int totalDiceMatchesNeeded){
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
            return "Yahtzee";
        } else {
            return "";
        }
    }

    public String fourOfAKind() {
        int totalDiceMatchesNeeded = 4;
        if (getCount(totalDiceMatchesNeeded) == 1) {
            return "Large Straight";
        } else {
            return "";
        }
    }

    public String threeOfAKind() {
        int totalDiceMatchesNeeded = 3;
        if (getCount(totalDiceMatchesNeeded) == 1) {
            return "Small Straight";
        } else {
            return "";
        }
    }

    public String fullHouse() {
        int totalDiceMatchesNeeded = 2;
        if (getCount(totalDiceMatchesNeeded) == 1) {
            return "Full House";
        } else {
            return "";
        }
    }

    public String twoPair() {
        int totalDiceMatchesNeeded = 1;
        if (getCount(totalDiceMatchesNeeded) == 1) {
            return "Two Pair";
        } else {
            return "";
        }
    }

    public String onePair() {
        int totalDiceMatchesNeeded = -1;
        if (getCount(totalDiceMatchesNeeded) == 1 && getMatches().size() != 5 ) {
            return "One Pair";
        } else {
            return "";
        }
    }



}

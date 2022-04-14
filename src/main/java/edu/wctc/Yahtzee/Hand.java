package edu.wctc.Yahtzee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

    private boolean fullHouseOrFourOfAKind() {
        return ((dieNumFrequencies().get(0) == 2 || dieNumFrequencies().get(0) == 3) && (dieNumFrequencies().get(1) == 2 || dieNumFrequencies().get(1) == 3));
    }

    private List<Integer> diceValues() {
        return getDieNum().stream().distinct().collect(Collectors.toList());
    }

    private List<Integer> dieNumFrequencies() {
        List<Integer> matches = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            matches.add(Collections.frequency(getDieNum(), i));
        }
        var integers = matches.stream().distinct().collect(Collectors.toList());
        integers.removeIf(i -> i == 0);
        return integers;
    }

    public String fiveOfAKind() {
        if (diceValues().size() == 1) {
            return "Yahtzee";
        } else {
            return "";
        }
    }

    public String fourOfAKind() {
        if (!fullHouseOrFourOfAKind()) {
            return "Large Straight";
        } else {
            return "";
        }
    }

    public String threeOfAKind() {
        if (diceValues().size() == 3) {
            return "Small Straight";
        } else {
            return "";
        }
    }

    public String fullHouse() {
        if (fullHouseOrFourOfAKind()) {
            return "Full House";
        } else {
            return "";
        }
    }

    public String twoPair() {
        List<Integer> matches = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            matches.add(Collections.frequency(getDieNum(), i));
        }
            int count = 0;
        for (Integer i :matches) {
            if (i == 2){
                count++;
            }
        }

        if (count == 2) {
            return "Two Pair";
        } else {
            return "";
        }
    }

}

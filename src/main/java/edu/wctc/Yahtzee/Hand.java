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

    private List<Integer> dieNumFrequencies(){
        List<Integer> matches = new ArrayList<>();
        for (int i = 1; i <= 6; i++){
            matches.add(Collections.frequency(getDieNum(), i));
        }

        var diceValues = matches.stream().distinct().collect(Collectors.toList());
        diceValues.removeIf(i -> i == 0);

        return diceValues;
    }

    public String fiveOfAKind() {
        var diceValues = getDieNum().stream().distinct().collect(Collectors.toList());

        if (diceValues.size() == 1) {
            return "Yahtzee";
        } else {
            return "";
        }
    }

    public String fourOfAKind() {
        if (!((dieNumFrequencies().get(0) == 2 || dieNumFrequencies().get(0) == 3) && (dieNumFrequencies().get(1) == 2 || dieNumFrequencies().get(1) == 3))) {
            return "Large Straight";
        } else {
            return "";
        }
    }

    public String threeOfAKind() {
        var diceValues = getDieNum().stream().distinct().collect(Collectors.toList());

        if (diceValues.size() == 3) {
            return "Small Straight";
        } else {
            return "";
        }
    }

    public String fullHouse() {
        if (((dieNumFrequencies().get(0) == 2 || dieNumFrequencies().get(0) == 3) && (dieNumFrequencies().get(1) == 2 || dieNumFrequencies().get(1) == 3))) {
            return "Full House";
        } else {
            return "";
        }
    }

}

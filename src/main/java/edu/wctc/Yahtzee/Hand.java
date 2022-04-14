package edu.wctc.Yahtzee;

import java.util.ArrayList;
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

    public String fiveOfAKind() {
        var diceValues = getDieNum().stream().distinct().collect(Collectors.toList());

        if (diceValues.size() == 1) {
            return "Yahtzee";
        } else {
            return "";
        }
    }


}

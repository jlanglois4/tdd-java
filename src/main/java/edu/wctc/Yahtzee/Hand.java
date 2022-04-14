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

    public String fiveOfAKind() {
        var diceValues = getDieNum().stream().distinct().collect(Collectors.toList());

        if (diceValues.size() == 1) {
            return "Yahtzee";
        } else {
            return "";
        }
    }

    public String fourOfAKind() {
        var diceValues = getDieNum().stream().distinct().collect(Collectors.toList());

        if (diceValues.size() == 2) {
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

        var diceValues = getDieNum();


        var ones = Collections.frequency(diceValues, 1);
        var twos = Collections.frequency(diceValues, 2);
        var threes = Collections.frequency(diceValues, 3);
        var fours = Collections.frequency(diceValues, 4);
        var fives = Collections.frequency(diceValues, 5);
        var sixes = Collections.frequency(diceValues, 6);

        List<Integer> matches = new ArrayList<>();
        matches.add(ones);
        matches.add(twos);
        matches.add(threes);
        matches.add(fours);
        matches.add(fives);
        matches.add(sixes);

        var fullHouseValues = matches.stream().distinct().collect(Collectors.toList());

        for (Integer i : fullHouseValues) {
            if (i == 0){
                fullHouseValues.remove(i);
            }
        }

        if ((fullHouseValues.get(0) == 2 || fullHouseValues.get(0) == 3) && (fullHouseValues.get(1) == 2 || fullHouseValues.get(1) == 3)) {
            return "Full House";
        } else {
            return "";
        }
    }
}

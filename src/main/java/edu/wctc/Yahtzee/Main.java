package edu.wctc.Yahtzee;

public class Main {
    public static void main(String[] args) {

        Die die1 = new Die((int) ((Math.random() * 6) + 1));
        Die die2 = new Die((int) ((Math.random() * 6) + 1));
        Die die3 = new Die((int) ((Math.random() * 6) + 1));
        Die die4 = new Die((int) ((Math.random() * 6) + 1));
        Die die5 = new Die((int) ((Math.random() * 6) + 1));

        Hand hand = new Hand(die1, die2, die3, die4, die5);

        System.out.println(die1.getDieNum() + " " + die2.getDieNum() + " " + die3.getDieNum() + " " + die4.getDieNum() + " " + die5.getDieNum());

        System.out.println(
        hand.oneOfAKind() + " " +
        hand.onePair() + " " +
        hand.twoPair() + " " +
        hand.fullHouse() + " " +
        hand.threeOfAKind() + " " +
        hand.fourOfAKind() + " " +
        hand.fiveOfAKind()
        );
    }
}

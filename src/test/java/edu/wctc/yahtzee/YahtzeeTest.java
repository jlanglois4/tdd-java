package edu.wctc.yahtzee;

import edu.wctc.Yahtzee.Die;
import edu.wctc.Yahtzee.Hand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YahtzeeTest {
    private Die die;
    private Hand hand;

    @BeforeEach
    void setUp() {
        die = new Die((int) ((Math.random() * 6) + 1));
    }

    @RepeatedTest(100)
    void diceReturnsInt() {
        boolean containsInt = (die.getDieNum() >= 1) && (die.getDieNum() <= 6);
        assertTrue(containsInt);
    }

    @Test
    void fiveOfAKindTestOne() {
        //Tested with five dice with all unique values
        Die die1 = new Die(1);
        Die die2 = new Die(1);
        Die die3 = new Die(1);
        Die die4 = new Die(1);
        Die die5 = new Die(1);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertEquals("Yahtzee", hand.fiveOfAKind());
    }

    @Test
    void fourOfAKindTestOne(){
        Die die1 = new Die(1);
        Die die2 = new Die(1);
        Die die3 = new Die(1);
        Die die4 = new Die(1);
        Die die5 = new Die(5);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertEquals("Four of a Kind", hand.fourOfAKind());
    }

    @Test
    void fourOfAKindTestTwo(){
        Die die1 = new Die(1);
        Die die2 = new Die(1);
        Die die3 = new Die(1);
        Die die4 = new Die(5);
        Die die5 = new Die(5);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertNotEquals("Four of a Kind", hand.fourOfAKind());
    }

    @Test
    void fourOfAKindTestThree(){
        Die die1 = new Die(1);
        Die die2 = new Die(5);
        Die die3 = new Die(1);
        Die die4 = new Die(5);
        Die die5 = new Die(5);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertNotEquals("Four of a Kind", hand.fourOfAKind());
    }

    @Test
    void threeOfAKindTestOne(){
        Die die1 = new Die(1);
        Die die2 = new Die(1);
        Die die3 = new Die(1);
        Die die4 = new Die(3);
        Die die5 = new Die(5);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertEquals("Three of a Kind", hand.threeOfAKind());
    }

    @Test
    void fullHouseTestOne(){
        Die die1 = new Die(1);
        Die die2 = new Die(1);
        Die die3 = new Die(1);
        Die die4 = new Die(5);
        Die die5 = new Die(5);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertEquals("Full House", hand.fullHouse());
    }

    @Test
    void fullHouseTestTwo(){
        Die die1 = new Die(3);
        Die die2 = new Die(2);
        Die die3 = new Die(2);
        Die die4 = new Die(1);
        Die die5 = new Die(3);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertNotEquals("Full House", hand.fullHouse());
    }

    @Test
    void twoPairTestOne(){
        Die die1 = new Die(3);
        Die die2 = new Die(2);
        Die die3 = new Die(2);
        Die die4 = new Die(6);
        Die die5 = new Die(6);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertEquals("Two Pair", hand.twoPair());
    }

    @Test
    void twoPairTestTwo(){
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        Die die3 = new Die(6);
        Die die4 = new Die(1);
        Die die5 = new Die(1);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertEquals("Two Pair", hand.twoPair());
    }

    @Test
    void onePairTestOne(){
        Die die1 = new Die(6);
        Die die2 = new Die(2);
        Die die3 = new Die(3);
        Die die4 = new Die(1);
        Die die5 = new Die(1);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertEquals("One Pair", hand.onePair());
    }

    @Test
    void onePairTestTwo(){
        Die die1 = new Die(6);
        Die die2 = new Die(4);
        Die die3 = new Die(3);
        Die die4 = new Die(2);
        Die die5 = new Die(1);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertNotEquals("One Pair", hand.onePair());
    }

    @Test
    void onePairTestThree(){
        Die die1 = new Die(6);
        Die die2 = new Die(3);
        Die die3 = new Die(3);
        Die die4 = new Die(6);
        Die die5 = new Die(6);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertEquals("One Pair", hand.onePair());
    }

    @Test
    void oneOfAKindTestOne(){
        Die die1 = new Die(6);
        Die die2 = new Die(4);
        Die die3 = new Die(3);
        Die die4 = new Die(2);
        Die die5 = new Die(1);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertEquals("Large Straight", hand.oneOfAKind());
    }

    @Test
    void oneOfAKindTestTwo(){
        Die die1 = new Die(6);
        Die die2 = new Die(4);
        Die die3 = new Die(3);
        Die die4 = new Die(2);
        Die die5 = new Die(2);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertNotEquals("Large Straight", hand.oneOfAKind());
    }
}

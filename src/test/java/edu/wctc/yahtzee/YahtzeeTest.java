package edu.wctc.yahtzee;

import edu.wctc.Yahtzee.Die;
import edu.wctc.Yahtzee.Hand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class YahtzeeTest {
    private Die die;
    private Hand hand;

    @BeforeEach
    void setUp() {
        die = new Die(4);
    }

    @RepeatedTest(100)
    void diceReturnsInt() {
        boolean containsInt = (die.getDieNum() >= 1) && (die.getDieNum() <= 6);
        assertTrue(containsInt);
    }

    @Test
    void fiveOfAKind() {
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
    void fourOfAKind(){
        Die die1 = new Die(1);
        Die die2 = new Die(1);
        Die die3 = new Die(1);
        Die die4 = new Die(1);
        Die die5 = new Die(5);

        hand = new Hand(die1, die2, die3, die4, die5);

        assertEquals("Large Straight", hand.fourOfAKind());
    }
}

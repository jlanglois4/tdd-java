package edu.wctc.yahtzee;

import edu.wctc.Yahtzee.Die;
import edu.wctc.Yahtzee.Hand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YahtzeeTest {
    private Die die;

    @BeforeEach
    void setUp(){
        die= new Die();
    }

    @RepeatedTest(100)
    void diceReturnsInt(){
        boolean containsInt = (die.getDieNum() >= 1) && (die.getDieNum() <= 6);
        assertEquals(true, containsInt);
    }


}

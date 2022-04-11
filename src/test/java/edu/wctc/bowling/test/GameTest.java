package edu.wctc.bowling.test;

import edu.wctc.bowling.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    private Game g;

    @BeforeEach
    void setUp() {
        g = new Game();
    }

    @Test
    void canCreateGame() {
//        Game g = new Game();
    }

    @Test
    void canRoll()
    {
//        Game g = new Game();
        g.roll(0);
    }

    @Test
    void gutterGame() {
//        for (int i = 0; i < 20; i++) {
//            g.roll(0);
//        }

        rollMany(20, 0);

        assertEquals(0, g.score());
    }

    @Test
    void allOnes() {
//        for (int i = 0; i < 20; i++) {
//            g.roll(1);
//        }

        rollMany(20, 1);

        assertEquals(20, g.score());
    }

    private void rollMany(int balls, int pins) {
        for (int i = 0; i < balls; i++) {
            g.roll(pins);
        }
    }

    @Test
    void oneSpare() {
        g.roll(5);
        g.roll(5); // spare (ugly comment)
        g.roll(3);
        rollMany(17, 0);

        assertEquals(16, g.score());
    }

    @Test
    void oneStrike() {
        g.roll(10); // strike (ugly comment)
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);

        assertEquals(24, g.score());
    }

    @Test
    void allStrikes() {
        rollMany(12, 10);

        assertEquals(300, g.score());
    }
}

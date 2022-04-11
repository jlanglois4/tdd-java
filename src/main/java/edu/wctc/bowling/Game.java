package edu.wctc.bowling;

public class Game {
//    private int score = 0;

    private int[] rolls = new int[21]; // max rolls in game is 21
    private int currentRoll = 0;

    public void roll(int pins) {
// Misaligned responsibility: method named roll is keeping score!
//        score += pins;

        rolls[currentRoll++] = pins;
    }

    public int score() {
//        return 0;
//        return score;

        int score = 0;

//        for (int i = 0; i < rolls.length; i++) {
//            if (rolls[i] + rolls[i+1] == 10) { // NOT ON FRAME
//                score += 10 + rolls[i + 2];
//            }
//        }

        int currentRoll = 0;
        for (int frame = 0; frame < 10; frame++) {
//            if (rolls[currentRoll] + rolls[currentRoll+1] == 10) { // spare (ugly comment)
            if (isSpare(currentRoll)) {
                score += 10 + rolls[currentRoll + 2];
                currentRoll += 2;
//            } else if (rolls[currentRoll] == 10) { // strike (ugly comment)
            } else if (isStrike(currentRoll)) {
                score += 10 + rolls[currentRoll + 1] + rolls[currentRoll + 2];
                currentRoll += 1;
            } else {
                score += rolls[currentRoll] + rolls[currentRoll + 1];
                currentRoll += 2;
            }
        }

        return score;
    }

    private boolean isStrike(int currentRoll) {
        return rolls[currentRoll] == 10;
    }

    private boolean isSpare(int currentRoll) {
        return rolls[currentRoll] + rolls[currentRoll+1] == 10;
    }
}

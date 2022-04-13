package edu.wctc.Yahtzee;

import java.util.ArrayList;
import java.util.List;

public class Die {

    private final int dieNum;
    private final int maxValue = 6;

    public Die(){
        dieNum = (int) ((Math.random() * maxValue) + 1);
    }

    public int getDieNum(){
        return dieNum;
    }

}
